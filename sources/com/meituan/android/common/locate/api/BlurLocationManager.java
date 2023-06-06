package com.meituan.android.common.locate.api;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* loaded from: classes2.dex */
public class BlurLocationManager {
    private static BlurLocationManager b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HashSet<a> a;
    private int c;

    /* loaded from: classes2.dex */
    public enum BlurState {
        BLUR_STATE_OPEN,
        BLUR_STATE_CLOSE,
        UNKNOWN;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        BlurState() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4a779225ba832d03b4928de3febb1be", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4a779225ba832d03b4928de3febb1be");
            }
        }

        public static BlurState valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (BlurState) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76d3ee69fae38508f33fe6d257256b87", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76d3ee69fae38508f33fe6d257256b87") : Enum.valueOf(BlurState.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BlurState[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (BlurState[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0a6f62f373bca923b4fcc2da1a55317", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0a6f62f373bca923b4fcc2da1a55317") : values().clone());
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
    }

    public BlurLocationManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "657baabda9cee872c83c7706a72f1096", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "657baabda9cee872c83c7706a72f1096");
        } else {
            this.a = new HashSet<>();
        }
    }

    private BlurState a(int i) {
        switch (i) {
            case -4:
            case -3:
            case -2:
            case -1:
                return BlurState.UNKNOWN;
            case 0:
                return BlurState.BLUR_STATE_CLOSE;
            case 1:
                return BlurState.BLUR_STATE_OPEN;
            default:
                return BlurState.UNKNOWN;
        }
    }

    public static BlurLocationManager a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ecadc9320f1d97f4022e7cf68ca9070", RobustBitConfig.DEFAULT_VALUE)) {
            return (BlurLocationManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ecadc9320f1d97f4022e7cf68ca9070");
        }
        if (b == null) {
            synchronized (BlurLocationManager.class) {
                if (b == null) {
                    b = new BlurLocationManager(context);
                }
            }
        }
        return b;
    }

    public BlurState a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "210e96e7fcb85f4375e10fa31d5b9f68", RobustBitConfig.DEFAULT_VALUE) ? (BlurState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "210e96e7fcb85f4375e10fa31d5b9f68") : a(this.c);
    }

    public void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb47d838923060870953fb32456c2303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb47d838923060870953fb32456c2303");
        } else {
            this.a.add(aVar);
        }
    }

    public boolean b() {
        return this.c == 1;
    }
}
