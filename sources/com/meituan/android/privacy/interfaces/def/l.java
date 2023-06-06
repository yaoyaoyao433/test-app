package com.meituan.android.privacy.interfaces.def;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l implements com.meituan.android.privacy.interfaces.r {
    public static ChangeQuickRedirect a;
    private ClipboardManager b;
    private com.meituan.android.privacy.interfaces.b c;

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b402c4fadb134b136b3552eafa53516a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b402c4fadb134b136b3552eafa53516a");
        }
    }

    public l(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea248ae9ea3607233235b6ba9f5c2f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea248ae9ea3607233235b6ba9f5c2f1");
        }
    }

    public l(Context context, com.meituan.android.privacy.interfaces.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fde9ed61359c43e71e9899810178fb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fde9ed61359c43e71e9899810178fb7");
            return;
        }
        this.b = null;
        this.c = bVar;
        if (context != null) {
            try {
                this.b = (ClipboardManager) context.getSystemService("clipboard");
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.r
    public final void a(@NonNull ClipData clipData) {
        Object[] objArr = {clipData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1cc0654475ec0a931e6fe209a4be36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1cc0654475ec0a931e6fe209a4be36");
        } else if (this.b != null) {
            this.b.setPrimaryClip(clipData);
            a("clpb.setPrimClip");
        }
    }

    @Override // com.meituan.android.privacy.interfaces.r
    @Nullable
    public final ClipData a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f3be97782bc654358cfe3b769735de", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClipData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f3be97782bc654358cfe3b769735de");
        }
        if (this.b != null) {
            ClipData primaryClip = this.b.getPrimaryClip();
            a("clpb.getPrimClip");
            return primaryClip;
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.r
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66720e258d98fd4caad98167ab8fb55f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66720e258d98fd4caad98167ab8fb55f")).booleanValue();
        }
        if (this.b != null) {
            boolean hasPrimaryClip = this.b.hasPrimaryClip();
            a("clpb.hasPrimClip");
            return hasPrimaryClip;
        }
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.r
    public final CharSequence c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9bfcef4d71e083240f9d80ad6b5b16", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9bfcef4d71e083240f9d80ad6b5b16");
        }
        if (this.b != null) {
            CharSequence text = this.b.getText();
            a("clpb.getTxt");
            return text;
        }
        return "";
    }

    @Override // com.meituan.android.privacy.interfaces.r
    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf67c4cfbe9fbc373881902dd2d47b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf67c4cfbe9fbc373881902dd2d47b1");
        } else if (this.b != null) {
            this.b.setText(charSequence);
            a("clpb.setTxt");
        }
    }
}
