package com.meituan.android.yoda.widget.view;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.android.yoda.model.b;
import com.meituan.android.yoda.util.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseTextView extends AppCompatTextView implements b.InterfaceC0379b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "BaseTextView";
    private boolean c;
    private b.c d;

    public BaseTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fe4f5b27899db2f369b6b565068bbdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fe4f5b27899db2f369b6b565068bbdb");
            return;
        }
        this.c = false;
        this.d = new b.c();
    }

    public BaseTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2131559333);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b31507e7e2f3a48e36822da7ad3cfad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b31507e7e2f3a48e36822da7ad3cfad");
        }
    }

    public BaseTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0c4b61c9d54e2bd72b39a54d901aa6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0c4b61c9d54e2bd72b39a54d901aa6");
            return;
        }
        this.c = false;
        this.d = new b.c();
        v a2 = v.a(context, attributeSet, new int[]{R.attr.yoda_switch, R.attr.yoda_reverse, R.attr.yoda_animate, R.attr.yoda_touchMode, R.attr.yoda_paint_color, R.attr.yoda_paint_width});
        this.c = a2.a(0, false);
        a2.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe57a519dc56de05255fd9e1e82cf67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe57a519dc56de05255fd9e1e82cf67");
            return;
        }
        super.onAttachedToWindow();
        if (com.meituan.android.yoda.config.ui.d.a().a() || !this.c) {
            return;
        }
        setTextColor(com.meituan.android.yoda.config.ui.d.a().j());
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ae8c9c957387b7f17d9a515cd14418", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ae8c9c957387b7f17d9a515cd14418")).booleanValue();
        }
        com.meituan.android.yoda.model.b.a(this).b();
        return super.performClick();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5788facaba2f119d6fda83f5a96f78cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5788facaba2f119d6fda83f5a96f78cf");
        }
        b.c cVar = this.d;
        cVar.b = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getBid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c0f4cd214de989bd867f71d09905e7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c0f4cd214de989bd867f71d09905e7") : this.d.getBid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ac422c9c608b2fa8620b5baf23b891", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ac422c9c608b2fa8620b5baf23b891");
        }
        b.c cVar = this.d;
        cVar.c = i;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public int getConfirmType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef270197e5d380b71108e8320ea9517e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef270197e5d380b71108e8320ea9517e")).intValue() : this.d.getConfirmType();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "496ce1f8640bc836baf8dbcdffbb1027", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "496ce1f8640bc836baf8dbcdffbb1027");
        }
        b.c cVar = this.d;
        cVar.d = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getRequestCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca82be7d46e9a894b8e7d84a247a8c7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca82be7d46e9a894b8e7d84a247a8c7") : this.d.getRequestCode();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public long getPageDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3337ae4b5752530b566a744780bee521", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3337ae4b5752530b566a744780bee521")).longValue() : this.d.getPageDuration();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05ebc14f19512298e8af32d617d32590", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05ebc14f19512298e8af32d617d32590");
        }
        b.c cVar = this.d;
        cVar.e = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffc5e13f47f693e3e831c9bcd09eb1d4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffc5e13f47f693e3e831c9bcd09eb1d4") : this.d.getAction();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6668819fd635a3ed04df62532fb239f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6668819fd635a3ed04df62532fb239f0");
        }
        b.c cVar = this.d;
        cVar.f = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageCid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8951d577832234c59ff0d5d62b1dcd35", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8951d577832234c59ff0d5d62b1dcd35") : this.d.getPageCid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "238b5047de0b47897fe0a83250600a05", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "238b5047de0b47897fe0a83250600a05");
        }
        b.c cVar = this.d;
        cVar.g = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageInfoKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b267fa84d4b3c3322b4b152852dbfbba", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b267fa84d4b3c3322b4b152852dbfbba") : this.d.getPageInfoKey();
    }
}
