package quick.pager.shop.order.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import quick.pager.shop.model.Model;

/**
 * 商户订单
 *
 * @author siguiyang
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@TableName("t_seller_order")
public class SellerOrder extends Model {

    private static final long serialVersionUID = 5577928979748151630L;

    /**
     * 用户主键
     */
    private Long userId;
    /**
     * 商户主键
     */
    private Long sellerId;
    /**
     * 配送地址
     */
    private Long addressId;
    /**
     * 商户订单号
     */
    private String orderCode;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 订单类型
     */
    private Integer orderType;
    /**
     * 支付方式
     * 0：支付宝
     * 1：微信
     */
    private Integer payType;
    /**
     * 订单金额
     */
    private BigDecimal orderAmount;
    /**
     * 是否支持自提
     */
    private Boolean self;

}
