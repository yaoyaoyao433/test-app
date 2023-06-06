package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class Node implements Serializable {
    public static final String FILED_NODE_ERROR_CODE = "errorCode";
    public static final String FILED_NODE_ERROR_MSG = "errorMsg";
    public static final String FILED_NODE_NAME = "nodeName";
    public static final String FILED_NODE_STATUS = "nodeStatus";
    public static final String FILED_NODE_TYPE = "nodeType";
    public static final String NODE_STATUS_ERROR = "2";
    public static final String NODE_STATUS_INIT = "0";
    public static final String NODE_STATUS_SUCCESS = "1";
    public static final String NODE_TYPE_CANCEL = "cancel";
    public static final String NODE_TYPE_EVENT = "event";
    public static final String NODE_TYPE_SUCCESS_END = "success_end";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String nodeName;
    public String nodeType;
    public String nodeStatus = "0";
    public int errorCode = 0;
    public String errorMsg = "";
    public List<String> historyNodeStatus = new ArrayList();

    public Node() {
        this.historyNodeStatus.add("0");
    }
}
