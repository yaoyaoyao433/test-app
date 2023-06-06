package com.sankuai.waimai.store.share;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.al;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect f;
    private View a;
    public Context g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.share.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1326a {
        void a(@Nullable String str);
    }

    public abstract void a(@NonNull View view);

    public a(Context context, @LayoutRes int i) {
        this(LayoutInflater.from(context).inflate(i, (ViewGroup) null));
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbbdc52e226a96980907d52c96b5be6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbbdc52e226a96980907d52c96b5be6b");
        }
    }

    private a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b741cdb95c463146a25d70e0d70d24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b741cdb95c463146a25d70e0d70d24");
            return;
        }
        this.a = view;
        if (view != null) {
            this.g = view.getContext();
            a(view);
        }
    }

    public void a(InterfaceC1326a interfaceC1326a) {
        Object[] objArr = {interfaceC1326a};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e506523fd17c0c0c2ed5b65deb09cce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e506523fd17c0c0c2ed5b65deb09cce3");
            return;
        }
        if (this.a != null) {
            this.a.measure(b(), c());
            this.a.layout(0, 0, this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        }
        al.a(new b(this.a, interfaceC1326a), getClass().getSimpleName());
    }

    public int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04642ce49ed0de67a94bb572de8f207d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04642ce49ed0de67a94bb572de8f207d")).intValue() : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3564f19443347cc722c27468555e4b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3564f19443347cc722c27468555e4b1")).intValue() : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public final class b extends al.b<String> {
        public static ChangeQuickRedirect a;
        private InterfaceC1326a c;
        private View d;

        @Override // com.sankuai.waimai.store.util.al.b
        public final /* synthetic */ String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c204e9f3dbfaeb1fc893819f900696f3", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c204e9f3dbfaeb1fc893819f900696f3");
            }
            View view = this.d;
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.share.b.a;
            return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "923ee2ff3df57f1f005c3ca79537fe7c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "923ee2ff3df57f1f005c3ca79537fe7c") : com.sankuai.waimai.store.manager.share.b.a(view, 0, (Drawable) null);
        }

        @Override // com.sankuai.waimai.store.util.al.b
        public final /* synthetic */ void a(String str) {
            String str2 = str;
            Object[] objArr = {str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45afd8cbd171b3925fe44bb86c4539f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45afd8cbd171b3925fe44bb86c4539f7");
            } else if (this.c != null) {
                this.c.a(str2);
            }
        }

        public b(View view, InterfaceC1326a interfaceC1326a) {
            Object[] objArr = {a.this, view, interfaceC1326a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2c2d940f41f8f952702d4dda463e52", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2c2d940f41f8f952702d4dda463e52");
                return;
            }
            this.d = view;
            this.c = interfaceC1326a;
        }
    }
}
