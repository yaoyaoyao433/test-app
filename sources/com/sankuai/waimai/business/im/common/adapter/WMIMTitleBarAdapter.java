package com.sankuai.waimai.business.im.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.utils.IMTextUtils;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.xm.imui.common.adapter.DialogModeSupportable;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.theme.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMIMTitleBarAdapter implements DialogModeSupportable, TitleBarAdapter {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    protected ImageView d;
    protected ImageView e;
    protected TextView f;
    protected TextView g;
    protected View h;
    protected View i;
    public boolean j;
    public boolean k;
    public String l;
    public int m;
    public int n;
    public View.OnClickListener o;
    private final String p;
    private Activity q;
    private String r;
    private int s;
    private a t;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onThemeChanged(b bVar) {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onTitleTextChanged(String str) {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onUnreadCountChanged(int i) {
    }

    public WMIMTitleBarAdapter(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097a40357514a0b7de07683f7a0ab1e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097a40357514a0b7de07683f7a0ab1e3");
            return;
        }
        this.t = aVar;
        this.p = getClass().getName() + System.currentTimeMillis();
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onAttach(Activity activity) {
        this.q = activity;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868c1592204c4328b2a5dabecbe84fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868c1592204c4328b2a5dabecbe84fc0");
            return;
        }
        this.q = null;
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.p);
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e8b59e53fb61ba372d8008592f1bcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e8b59e53fb61ba372d8008592f1bcb");
        }
        if (context == null || viewGroup == null) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_im_titlebar_layout, viewGroup, true);
        a(inflate);
        return inflate;
    }

    public void a(View view) {
        float width;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e54f43b0fdbda0a1a7d7011f42dfb14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e54f43b0fdbda0a1a7d7011f42dfb14");
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.title_tv);
        TextView textView2 = (TextView) view.findViewById(R.id.tag_tv);
        this.h = view.findViewById(R.id.ic_im_view1);
        this.i = view.findViewById(R.id.ic_im_view2);
        this.d = (ImageView) this.h.findViewById(R.id.im_title_icon_iv);
        this.f = (TextView) this.h.findViewById(R.id.im_title_text_tv);
        this.e = (ImageView) this.i.findViewById(R.id.im_title_icon_iv);
        this.g = (TextView) this.i.findViewById(R.id.im_title_text_tv);
        final View findViewById = view.findViewById(R.id.ll_left_layout);
        textView.setText(this.b);
        if (!TextUtils.isEmpty(this.c)) {
            textView2.setVisibility(0);
            textView2.setText(this.c);
            textView2.setBackgroundResource(this.n);
            String str = this.c;
            Object[] objArr2 = {str, 0, 10};
            ChangeQuickRedirect changeQuickRedirect2 = IMTextUtils.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "025727e8d306318823a64e506876a46a", RobustBitConfig.DEFAULT_VALUE)) {
                width = ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "025727e8d306318823a64e506876a46a")).floatValue();
            } else {
                Paint paint = new Paint();
                paint.setTextSize(10.0f);
                paint.setTypeface(Typeface.DEFAULT);
                Rect rect = new Rect();
                paint.getTextBounds(str, 0, str.length(), rect);
                width = rect.width();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
            marginLayoutParams.leftMargin = -g.b(this.q, width + 16.0f);
            textView2.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            marginLayoutParams2.rightMargin = g.a(this.q, width + 4.0f + 16.0f);
            textView.setLayoutParams(marginLayoutParams2);
        }
        this.f.setText(TextUtils.isEmpty(this.l) ? "电话" : this.l);
        this.g.setText(TextUtils.isEmpty(this.r) ? "店铺" : this.r);
        ah.a(this.d, this.m > 0 ? this.m : R.drawable.wm_im_ic_phone_2);
        ah.a(this.e, this.s > 0 ? this.s : R.drawable.wm_im_ic_poi);
        this.h.setVisibility(this.j ? 0 : 8);
        this.i.setVisibility(this.k ? 0 : 8);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8fe0794ad77dd7a67c297b6a0e0d8214", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8fe0794ad77dd7a67c297b6a0e0d8214");
                } else if (WMIMTitleBarAdapter.this.o != null) {
                    WMIMTitleBarAdapter.this.o.onClick(findViewById);
                } else if (WMIMTitleBarAdapter.this.q == null || WMIMTitleBarAdapter.this.q.isFinishing()) {
                } else {
                    WMIMTitleBarAdapter.this.q.finish();
                }
            }
        });
        if (this.t != null) {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d720b73d3e561523c8320846532abfc4", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d720b73d3e561523c8320846532abfc4");
                    } else {
                        WMIMTitleBarAdapter.this.t.a();
                    }
                }
            });
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.adapter.WMIMTitleBarAdapter.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9b44fda63f62cefa053694a8aaab003b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9b44fda63f62cefa053694a8aaab003b");
                    } else {
                        WMIMTitleBarAdapter.this.t.b();
                    }
                }
            });
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f1a732a32f845c94a8fd1a8b83c734d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f1a732a32f845c94a8fd1a8b83c734d");
            return;
        }
        this.j = false;
        if (this.h != null) {
            this.h.setVisibility(8);
        }
    }
}
