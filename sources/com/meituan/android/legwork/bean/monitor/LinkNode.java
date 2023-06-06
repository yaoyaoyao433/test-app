package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class LinkNode implements Serializable {
    public static final String FILED_NODE_NAME = "nodeName";
    public static final String FILED_NODE_TYPE = "nodeType";
    public static final String FILED_TIMEOUT = "timeout";
    public static final String LINK_NO_PAUSE = "0";
    public static final String LINK_PAUSE = "1";
    public static final String MRN_START_NODE_NAME = "mrn-start";
    public static final int NODE_DEFAULT_TIMEOUT = 30;
    public static final String NODE_TYPE_CANCEL = "cancel";
    public static final String NODE_TYPE_END = "end";
    public static final String NODE_TYPE_ERROR = "error";
    public static final String NODE_TYPE_EVENT = "event";
    public static final String NODE_TYPE_START = "start";
    public static final String NODE_TYPE_TIME_OUT = "time_out";
    public static ChangeQuickRedirect changeQuickRedirect;
    public long duration;
    public long lastOpreateScreanTimestamp;
    public String linkPause = "0";
    public String nodeName;
    public String nodeType;
    public long timeout;
    public long timestamp;
}
