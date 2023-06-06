package com.meituan.mmp.lib.api.device;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsScanCodeModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsScanCode extends ApiFunction<ScanCodeParams, ScanCodeResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ScanCodeParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean onlyFromCamera;
        public String[] scanType;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ScanCodeResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String result;
        public String scanType;
    }
}
