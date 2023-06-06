package com.meituan.android.edfu.mvex.ui.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private View c;
    private ImageView d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private View h;
    private ImageView i;
    private ImageView j;
    private String k;
    private Button l;
    private InterfaceC0256a m;
    private View.OnClickListener n;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.edfu.mvex.ui.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0256a {
        void a();
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "68fd591c59e7353ec4f96f62948b404e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "68fd591c59e7353ec4f96f62948b404e");
            return;
        }
        aVar.setVisibility(8);
        if (aVar.m != null) {
            aVar.m.a();
        }
    }

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1da132e3bcb992f327850d158a9adf0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1da132e3bcb992f327850d158a9adf0");
            return;
        }
        this.k = "https://s3plus.sankuai.com/v1/mss_fad1a48f61e8451b8172ba5abfdbbee5/img-tmp/ic_medicine_tips.png";
        this.n = new View.OnClickListener() { // from class: com.meituan.android.edfu.mvex.ui.widget.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d592318af89e5c8886881aa0133567c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d592318af89e5c8886881aa0133567c");
                } else if (view.getId() == R.id.img_tips_close) {
                    a.a(a.this);
                } else if (view.getId() == R.id.btn_tryagain) {
                    a.a(a.this);
                } else if (view.getId() == R.id.img_medicine_errorclose) {
                    a.a(a.this);
                }
            }
        };
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "958544ffd676acb89bf7950c681c00d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "958544ffd676acb89bf7950c681c00d5");
            return;
        }
        this.b = LayoutInflater.from(context).inflate(R.layout.layout_commonstate, this);
        this.c = this.b.findViewById(R.id.container_medicine_tips);
        this.d = (ImageView) this.b.findViewById(R.id.img_tips_close);
        this.d.setOnClickListener(this.n);
        this.h = this.b.findViewById(R.id.container_error_tips);
        this.l = (Button) this.b.findViewById(R.id.btn_tryagain);
        this.l.setOnClickListener(this.n);
        this.i = (ImageView) this.b.findViewById(R.id.img_medicine_errorclose);
        this.i.setOnClickListener(this.n);
        this.e = (ImageView) this.b.findViewById(R.id.img_result_tipimage);
        this.j = (ImageView) this.b.findViewById(R.id.img_error_tipimage);
        this.f = (TextView) this.b.findViewById(R.id.medicine_tips_title);
        this.g = (TextView) this.b.findViewById(R.id.medicine_search_tips);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "349ffb46b23ea1358ed1734c7956a9b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "349ffb46b23ea1358ed1734c7956a9b7");
            return;
        }
        switch (i) {
            case 1:
                this.c.setVisibility(0);
                this.h.setVisibility(8);
                return;
            case 2:
                this.c.setVisibility(8);
                this.h.setVisibility(0);
                return;
            default:
                return;
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83a310eae0e3e0a2602a20bbfada9bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83a310eae0e3e0a2602a20bbfada9bd");
            return;
        }
        this.f.setText(str);
        this.g.setText(str2);
        Picasso.g(getContext()).d(str3).a(new b(12)).a(this.e);
        Picasso.g(getContext()).d(str3).a(new b(12)).a(this.j);
    }

    public final void setStateViewListener(InterfaceC0256a interfaceC0256a) {
        this.m = interfaceC0256a;
    }
}
