package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MRNAddCustomKeyBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<String> abTestKeys;
    public ArrayList<String> bundleNames;
    public ArrayList<String> funcConfigResultKeys;
}
