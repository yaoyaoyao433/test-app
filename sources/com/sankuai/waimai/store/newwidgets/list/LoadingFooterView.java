package com.sankuai.waimai.store.newwidgets.list;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LoadingFooterView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private View c;
    private TextView d;
    private TextView e;

    public LoadingFooterView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c5d224b29b7ba8ca6bcb3b974094b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c5d224b29b7ba8ca6bcb3b974094b7");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }

    private LoadingFooterView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900a7bc38f90304c6a232973ef818554", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900a7bc38f90304c6a232973ef818554");
        }
    }

    public LoadingFooterView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6c1b9e60f4ed415476afc01a435d73a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6c1b9e60f4ed415476afc01a435d73a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f373a8c2ceb310e9a6c4976d58646a60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f373a8c2ceb310e9a6c4976d58646a60");
            return;
        }
        setOrientation(1);
        z.a(getContext(), R.layout.wm_sc_goods_list_footer_view, this);
        this.b = findViewById(R.id.loadingView);
        this.c = findViewById(R.id.noMoreView);
        this.d = (TextView) findViewById(R.id.tv_list_footer_no_more_tip);
        this.e = (TextView) findViewById(R.id.tv_list_footer_loading_tip);
        a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "830058963d82ac6ee0623cf387916307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "830058963d82ac6ee0623cf387916307");
            return;
        }
        c();
        e();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848dbb6877155ed527271669f5c97c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848dbb6877155ed527271669f5c97c5f");
            return;
        }
        this.c.setVisibility(0);
        this.b.setVisibility(8);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6056ec9406b9008da0a48cb793c29aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6056ec9406b9008da0a48cb793c29aed");
        } else {
            this.c.setVisibility(8);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44992cfce066e7ec390aca3c7f68cdaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44992cfce066e7ec390aca3c7f68cdaa");
            return;
        }
        this.c.setVisibility(8);
        this.b.setVisibility(0);
    }

    public void setNoMoreTipText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c9b72c51c9c322b2cef43ebef015f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c9b72c51c9c322b2cef43ebef015f6f");
        } else {
            u.a(this.d, str);
        }
    }

    public void setLoadingTipText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29d2343bab92002b3425db6b9e94e9c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29d2343bab92002b3425db6b9e94e9c9");
        } else {
            u.a(this.e, str);
        }
    }

    public void setNoMoreViewHeight(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c9d614013558485256b1e896d0964e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c9d614013558485256b1e896d0964e");
            return;
        }
        int dimensionPixelOffset = this.c.getResources().getDimensionPixelOffset(i);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.height = dimensionPixelOffset;
        this.c.setLayoutParams(layoutParams);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a42a576b4e555ac27c7f85450e673624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a42a576b4e555ac27c7f85450e673624");
        } else {
            this.b.setVisibility(8);
        }
    }

    public void setNoMoreView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e960244c0586fc7c07c5742668522824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e960244c0586fc7c07c5742668522824");
            return;
        }
        removeView(this.c);
        this.c = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
        this.c.setVisibility(8);
        addView(this.c);
    }
}
