package com.xy.springboot.model.dto.task;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 任务查询请求
 */
@Data
public class TaskQueryRequest implements Serializable {

    /**
     * 任务id
     */
    private Long taskId;

    /**
     * 任务状态
     */
    private String curStatus;
    /**
     * 任务名称
     */
    private String taskName;

    private static final long serialVersionUID = 1L;
}
