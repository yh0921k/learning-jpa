package study.jpa.domains.order_item.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "order_item")
public class OrderItem {

  @Id @GeneratedValue
  @Column(name = "order_item_id")
  private Long id;

  @Column(name = "item_id")
  private Long itemId;

  @Column(name = "order_id")
  private Long orderId;

  private int orderPrice;
  private int count;
}