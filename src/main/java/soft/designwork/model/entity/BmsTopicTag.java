package soft.designwork.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 帖子列表功能后端
 * @author 29237
 */
@Data
@TableName("bms_post_tag")
@Accessors(chain = true)
public class BmsTopicTag implements Serializable {
    private static final long serialVersionUID = -5028599844989220715L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("tag_id")
    private String tagId;

    @TableField("topic_id")
    private String topicId;
}

