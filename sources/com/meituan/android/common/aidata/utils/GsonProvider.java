package com.meituan.android.common.aidata.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GsonProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Gson sDefault = new GsonBuilder().create();

    public static Gson getInstance() {
        return sDefault;
    }
}
