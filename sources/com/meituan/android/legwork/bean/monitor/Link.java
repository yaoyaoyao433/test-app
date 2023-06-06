package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class Link implements Serializable {
    public static final int DEFAULT_LINK_CANCEL_TIMES = 0;
    public static final long DEFAULT_LINK_EXPIRE_DURATION = 600;
    public static final int STATUS_CANCEL = 8;
    public static final int STATUS_END = 4;
    public static final int STATUS_ERROR = 32;
    public static final int STATUS_PAUSE = 2;
    public static final int STATUS_PROCESSING = 1;
    public static final int STATUS_TIME_OUT = 16;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bizName;
    public String identifier;
    public String parentIdentifier;
    public List<LinkNode> linkNodes = new ArrayList();
    public int status = 1;
    public long updateTimestamp = c.b() / 1000;

    public Link(String str, String str2, String str3) {
        this.bizName = str;
        this.identifier = str2;
        this.parentIdentifier = str3;
    }
}
