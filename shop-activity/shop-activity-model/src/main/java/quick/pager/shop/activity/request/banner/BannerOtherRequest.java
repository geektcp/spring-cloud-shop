package quick.pager.shop.activity.request.banner;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import quick.pager.shop.request.Request;

/**
 * Banner PageRequest
 *
 * @author siguiyang
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BannerOtherRequest extends Request {

    private static final long serialVersionUID = 9167439469144610401L;
    /**
     * 活动标题
     */
    private String title;
    /**
     * banner 类型
     */
    private String bannerType;
    /**
     * 分享渠道
     */
    private List<String> shareChannel;

}
