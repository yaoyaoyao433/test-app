package com.meituan.android.yoda.widget.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.android.yoda.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseImageView extends AppCompatImageView implements b.InterfaceC0379b {
    public static ChangeQuickRedirect a;
    private b.c b;

    public BaseImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6f9fa31a93215ab117a24efce9a7ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6f9fa31a93215ab117a24efce9a7ec");
        } else {
            this.b = new b.c();
        }
    }

    public BaseImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650872594805b820a409d540e525e39e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650872594805b820a409d540e525e39e");
        } else {
            this.b = new b.c();
        }
    }

    public BaseImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb853514690843daa33d688e13e374f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb853514690843daa33d688e13e374f6");
        } else {
            this.b = new b.c();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f91ff25c36f3709fe6ce00a82ed5eb7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f91ff25c36f3709fe6ce00a82ed5eb7")).booleanValue();
        }
        com.meituan.android.yoda.model.b.a(this).b();
        return super.performClick();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083dcef9af2d036bfec436e75c635aec", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083dcef9af2d036bfec436e75c635aec");
        }
        b.c cVar = this.b;
        cVar.b = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getBid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4080bf076a7e7d7a71a11d1bed477b8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4080bf076a7e7d7a71a11d1bed477b8") : this.b.getBid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce7000fb70915ac5ca22293226c69c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce7000fb70915ac5ca22293226c69c9");
        }
        b.c cVar = this.b;
        cVar.c = i;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public int getConfirmType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9be60e8e381dc0c69f887c2e67542ea9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9be60e8e381dc0c69f887c2e67542ea9")).intValue() : this.b.getConfirmType();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da56573ac095b13a17f9ecec96b48db6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da56573ac095b13a17f9ecec96b48db6");
        }
        b.c cVar = this.b;
        cVar.d = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getRequestCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e43cffd6b823fcccb43b62299cfbb4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e43cffd6b823fcccb43b62299cfbb4") : this.b.getRequestCode();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public long getPageDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "227549ece8295707aa9d4ba0e42a0c6f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "227549ece8295707aa9d4ba0e42a0c6f")).longValue() : this.b.getPageDuration();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ceeec61be73d21e3780d0489d9bd0c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ceeec61be73d21e3780d0489d9bd0c8");
        }
        b.c cVar = this.b;
        cVar.e = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede5bb645a7f5ad1e4fc6cd9bbdcdd8b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede5bb645a7f5ad1e4fc6cd9bbdcdd8b") : this.b.getAction();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "307c659c95a8d86c8bf1dfe0feae5298", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "307c659c95a8d86c8bf1dfe0feae5298");
        }
        b.c cVar = this.b;
        cVar.f = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageCid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4119637edf541be2bd815126be5815f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4119637edf541be2bd815126be5815f") : this.b.getPageCid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b46369dba3a47587c6a3f0edbecba9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b46369dba3a47587c6a3f0edbecba9e");
        }
        b.c cVar = this.b;
        cVar.g = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageInfoKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c367a3731951e4c781d863053013db", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c367a3731951e4c781d863053013db") : this.b.getPageInfoKey();
    }
}
