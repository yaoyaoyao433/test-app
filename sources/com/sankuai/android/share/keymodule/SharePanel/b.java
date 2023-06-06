package com.sankuai.android.share.keymodule.SharePanel;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.ShareActivity;
import com.sankuai.android.share.bean.AppBean;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    Context b;
    List<AppBean> c;
    public a d;
    public InterfaceC0541b e;
    private HashMap<String, String> f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(AppBean appBean);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.android.share.keymodule.SharePanel.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0541b {
        void a(List<AppBean> list);
    }

    public b(Context context, List<AppBean> list, HashMap<String, String> hashMap) {
        Object[] objArr = {context, list, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f70eeff83634772e3b98ec5c11e1a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f70eeff83634772e3b98ec5c11e1a3");
            return;
        }
        this.b = context;
        this.c = list;
        this.f = hashMap;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bda2a03b395333ae56b2e06ee74d821f", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bda2a03b395333ae56b2e06ee74d821f") : new c(LayoutInflater.from(this.b).inflate(R.layout.share_griditem_base_share, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.s sVar, final int i) {
        final AppBean appBean;
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1825044e9ade83c818bf78614e5bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1825044e9ade83c818bf78614e5bc6");
        } else if (sVar instanceof c) {
            final c cVar = (c) sVar;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ee0199d8e2d8769d69bfe0a75bb895e", RobustBitConfig.DEFAULT_VALUE)) {
                appBean = (AppBean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ee0199d8e2d8769d69bfe0a75bb895e");
            } else {
                appBean = (i < 0 || i >= getItemCount()) ? null : this.c.get(i);
            }
            if (appBean != null) {
                if (appBean.getIcon() != null) {
                    cVar.a.setImageDrawable(appBean.getIcon());
                } else {
                    cVar.a.setImageResource(appBean.getAppIcon());
                }
                cVar.b.setText(appBean.getAppName());
                if (this.f == null || this.f.size() <= 0) {
                    cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.android.share.keymodule.SharePanel.b.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0877d86ccb5bff9e1ccb00b2772f18c", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0877d86ccb5bff9e1ccb00b2772f18c");
                            } else if (b.this.d != null) {
                                b.this.d.a(appBean);
                            }
                        }
                    });
                    if (i != this.c.size() - 1 || this.e == null) {
                        return;
                    }
                    this.e.a(this.c);
                } else if (this.b instanceof ShareActivity) {
                    final String a2 = ((ShareActivity) this.b).a(appBean.getId());
                    cVar.c.setText(a2);
                    cVar.c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.android.share.keymodule.SharePanel.b.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6e17540b10b49dca12233f4fb9ccf764", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6e17540b10b49dca12233f4fb9ccf764");
                                return;
                            }
                            int width = cVar.c.getLayout().getWidth();
                            if (width > 0 && width <= com.sankuai.android.share.common.util.b.a(b.this.b, 30.0f)) {
                                b.this.c.get(i).setBubbleText(a2);
                            }
                            cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.android.share.keymodule.SharePanel.b.2.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr4 = {view};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ae9fe26b729666716dd730fbf3cc3be0", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ae9fe26b729666716dd730fbf3cc3be0");
                                    } else if (b.this.d != null) {
                                        b.this.d.a(b.this.c.get(i));
                                    }
                                }
                            });
                            if (i == b.this.c.size() - 1 && b.this.e != null) {
                                b.this.e.a(b.this.c);
                            }
                            if (width > 0 && width <= com.sankuai.android.share.common.util.b.a(b.this.b, 30.0f)) {
                                cVar.c.setVisibility(0);
                                int width2 = cVar.c.getWidth();
                                ConstraintLayout.a aVar = (ConstraintLayout.a) cVar.c.getLayoutParams();
                                aVar.leftMargin += com.sankuai.android.share.common.util.b.a(b.this.b, 15.0f) - (width2 / 2);
                                cVar.c.setLayoutParams(aVar);
                                cVar.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                return;
                            }
                            cVar.c.setVisibility(4);
                            cVar.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                    });
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8385e9560165054a1df4116cb80989", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8385e9560165054a1df4116cb80989")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.s {
        public ImageView a;
        public TextView b;
        public TextView c;

        public c(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.share_image);
            this.b = (TextView) view.findViewById(R.id.share_name);
            this.c = (TextView) view.findViewById(R.id.share_shareBubbleTextView);
        }
    }
}
