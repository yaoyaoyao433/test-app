package com.meituan.android.legwork.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class TopBarBean implements Serializable {
    public static final int BUSINESS_TYPE_BUY = 2;
    public static final int BUSINESS_TYPE_SEND = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String picUrl;
    public String selectedPicUrl;
    public int type;
}
