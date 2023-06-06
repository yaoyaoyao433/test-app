package com.meituan.android.common.metricx.bytehook;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ByteHookConfig {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final boolean defaultDebug = false;
    private static final Mode defaultMode = Mode.AUTOMATIC;
    public boolean debug;
    public Mode mode;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum Mode {
        AUTOMATIC(0),
        MANUAL(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int value;

        public static Mode valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0bee6409bdbb54c0d800f865f2ac8590", RobustBitConfig.DEFAULT_VALUE) ? (Mode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0bee6409bdbb54c0d800f865f2ac8590") : (Mode) Enum.valueOf(Mode.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Mode[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b6c466768c7b13f6785780fabc28603", RobustBitConfig.DEFAULT_VALUE) ? (Mode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b6c466768c7b13f6785780fabc28603") : (Mode[]) values().clone();
        }

        Mode(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc5825994fb2e739a75cf9f56c22e82d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc5825994fb2e739a75cf9f56c22e82d");
            } else {
                this.value = i;
            }
        }

        public final int getValue() {
            return this.value;
        }
    }

    public ByteHookConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e50609cfdfda5317bdcbb6fd64f62f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e50609cfdfda5317bdcbb6fd64f62f");
            return;
        }
        this.mode = defaultMode;
        this.debug = false;
    }

    public Mode getMode() {
        return this.mode;
    }

    public boolean getDebug() {
        return this.debug;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean debug;
        private Mode mode;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4af04b0a3442825f88fd6dde72d2c36d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4af04b0a3442825f88fd6dde72d2c36d");
                return;
            }
            this.mode = ByteHookConfig.defaultMode;
            this.debug = false;
        }

        public Builder setMode(Mode mode) {
            this.mode = mode;
            return this;
        }

        public Builder setDebug(boolean z) {
            this.debug = z;
            return this;
        }

        public ByteHookConfig build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e13e7d278fdfcaeedc384f15882f0542", RobustBitConfig.DEFAULT_VALUE)) {
                return (ByteHookConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e13e7d278fdfcaeedc384f15882f0542");
            }
            ByteHookConfig byteHookConfig = new ByteHookConfig();
            byteHookConfig.mode = this.mode;
            byteHookConfig.debug = this.debug;
            return byteHookConfig;
        }
    }
}
