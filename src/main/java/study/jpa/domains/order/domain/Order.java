package study.jpa.domains.order.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;

@Getter
@Entity
@Table(name = "orders")
public class Order {

  @Id @GeneratedValue
  @Column(name = "order_id")
  private Long id;

  @Column(name = "member_id")
  private Long memberId;

  @Temporal(TemporalType.TIMESTAMP)
  private Date orderDate;

  @Enumerated(EnumType.STRING)
  private OrderStatus status;
}
