package study.jpa.domains.order_item.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import study.jpa.domains.item.domain.Item;
import study.jpa.domains.order.domain.Order;

@Getter
@Entity
@Table(name = "order_item")
public class OrderItem {

  @Id @GeneratedValue
  @Column(name = "order_item_id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "item_id")
  private Item item;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;

  private int orderPrice;
  private int count;

  public void setOrder(Order order) {
    this.order = order;
  }
}
