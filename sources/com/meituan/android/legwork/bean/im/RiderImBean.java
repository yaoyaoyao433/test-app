package com.meituan.android.legwork.bean.im;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class RiderImBean implements Serializable {
    public static final int IM_DEGRADE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean areaSupport;
    public int isDegrade;
    public short peerAppId;
    public long peerId;
    public boolean peerSupport;
}
