package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class NodeLink implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bizName;
    public String identifier;
    public List<Node> nodes = new ArrayList();
    public String parentIdentifier;

    public NodeLink(String str, String str2, String str3) {
        this.bizName = str;
        this.identifier = str2;
        this.parentIdentifier = str3;
    }
}
