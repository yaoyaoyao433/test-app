package com.sankuai.waimai.business.ugc.live.utils;

import android.content.Context;
import android.media.AudioManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private AudioManager b;
    private AudioManager.OnAudioFocusChangeListener c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.ugc.live.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0876a {
    }

    public final int a(Context context, InterfaceC0876a interfaceC0876a) {
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072456028e3eabd9cd66cf91dad94142", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072456028e3eabd9cd66cf91dad94142")).intValue();
        }
        if (this.b == null) {
            this.b = (AudioManager) context.getSystemService("audio");
        }
        if (this.c == null) {
            this.c = new AudioManager.OnAudioFocusChangeListener() { // from class: com.sankuai.waimai.business.ugc.live.utils.a.1
                public static ChangeQuickRedirect a;

                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6ba9573855b94db1831ccc8aae98201", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6ba9573855b94db1831ccc8aae98201");
                    }
                }
            };
        }
        if (this.b != null) {
            return this.b.requestAudioFocus(this.c, 3, 2);
        }
        return 0;
    }
}
