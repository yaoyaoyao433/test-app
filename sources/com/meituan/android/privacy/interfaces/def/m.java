package com.meituan.android.privacy.interfaces.def;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m implements com.meituan.android.privacy.interfaces.s {
    public static ChangeQuickRedirect a;
    private ClipboardManager b;
    private com.meituan.android.privacy.interfaces.b c;

    private void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10febaa242c5f447fe3c8ccecdda0db2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10febaa242c5f447fe3c8ccecdda0db2");
        }
    }

    public m(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922ddf308e2f50b17a981d73bdc0dafb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922ddf308e2f50b17a981d73bdc0dafb");
        }
    }

    public m(Context context, com.meituan.android.privacy.interfaces.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8653ccbecf0cb3f83203d34a9845dd5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8653ccbecf0cb3f83203d34a9845dd5b");
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

    @Override // com.meituan.android.privacy.interfaces.s
    public final void a(String str, @NonNull ClipData clipData) {
        Object[] objArr = {str, clipData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92e671e90d501ee6586ce083c1f88053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92e671e90d501ee6586ce083c1f88053");
        } else if (this.b != null) {
            this.b.setPrimaryClip(clipData);
            f("clpb.setPrimClip");
        }
    }

    @Override // com.meituan.android.privacy.interfaces.s
    @RequiresApi(api = 28)
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9085e9a5294e866bdc6b4b17f6befbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9085e9a5294e866bdc6b4b17f6befbf");
        } else if (this.b != null) {
            this.b.clearPrimaryClip();
            f("clpb.clearPrimClip");
        }
    }

    @Override // com.meituan.android.privacy.interfaces.s
    @Nullable
    public final ClipData b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e4c56fe5e778cfe6b6f144398f0716", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClipData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e4c56fe5e778cfe6b6f144398f0716");
        }
        if (this.b != null) {
            ClipData primaryClip = this.b.getPrimaryClip();
            f("clpb.getPrimClip");
            return primaryClip;
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.s
    @Nullable
    public final ClipDescription c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e9552fc6548960157f5c3ede3425d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClipDescription) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e9552fc6548960157f5c3ede3425d3");
        }
        if (this.b != null) {
            ClipDescription primaryClipDescription = this.b.getPrimaryClipDescription();
            f("clpb.getPrimClipDescrip");
            return primaryClipDescription;
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.s
    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c188e0b69d64eb32cdf4692fdb72415e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c188e0b69d64eb32cdf4692fdb72415e")).booleanValue();
        }
        if (this.b != null) {
            boolean hasPrimaryClip = this.b.hasPrimaryClip();
            f("clpb.hasPrimClip");
            return hasPrimaryClip;
        }
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.s
    public final CharSequence e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f70c746e6c929a7b4c0a381b49d1bb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f70c746e6c929a7b4c0a381b49d1bb8");
        }
        if (this.b != null) {
            CharSequence text = this.b.getText();
            f("clpb.getTxt");
            return text;
        }
        return "";
    }

    @Override // com.meituan.android.privacy.interfaces.s
    public final void a(String str, CharSequence charSequence) {
        Object[] objArr = {str, charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4087e1808f45fda5136297ed3a70a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4087e1808f45fda5136297ed3a70a5b");
        } else if (this.b != null) {
            this.b.setText(charSequence);
            f("clpb.setTxt");
        }
    }
}
