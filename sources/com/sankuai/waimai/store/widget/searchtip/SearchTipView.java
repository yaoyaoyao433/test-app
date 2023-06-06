package com.sankuai.waimai.store.widget.searchtip;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.RecommendSearchResponse;
import com.sankuai.waimai.store.util.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SearchTipView extends BaseCustomFrameLayout {
    public static ChangeQuickRedirect e;
    public com.sankuai.waimai.store.widget.searchtip.b f;
    private HorizontalFlowLayout g;
    private com.sankuai.waimai.store.param.a h;
    private c i;
    private b j;
    private PoiChannelBackgroundConfig k;
    private PoiVerticalityDataResponse.Promotion l;
    private final d m;
    private final Runnable n;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(View view, Map<String, Object> map);

        void a(Map<String, Object> map);
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return -1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d extends Handler {
        private WeakReference<SearchTipView> a;

        public d(SearchTipView searchTipView) {
            this.a = new WeakReference<>(searchTipView);
        }
    }

    public SearchTipView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c432761b0b2deb7663bb64523f0b7b1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c432761b0b2deb7663bb64523f0b7b1f");
            return;
        }
        this.m = new d(this);
        this.n = new Runnable() { // from class: com.sankuai.waimai.store.widget.searchtip.SearchTipView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0a24aae7c5e4179b3eb81685065bb1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0a24aae7c5e4179b3eb81685065bb1f");
                } else if (com.sankuai.waimai.store.util.b.a(SearchTipView.this.c)) {
                } else {
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.a(((SCBaseActivity) SearchTipView.this.c).w()));
                }
            }
        };
    }

    public SearchTipView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf304ddd58de6b36263bfdbb342b5a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf304ddd58de6b36263bfdbb342b5a1");
            return;
        }
        this.m = new d(this);
        this.n = new Runnable() { // from class: com.sankuai.waimai.store.widget.searchtip.SearchTipView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0a24aae7c5e4179b3eb81685065bb1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0a24aae7c5e4179b3eb81685065bb1f");
                } else if (com.sankuai.waimai.store.util.b.a(SearchTipView.this.c)) {
                } else {
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.a(((SCBaseActivity) SearchTipView.this.c).w()));
                }
            }
        };
    }

    public SearchTipView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2b5f3ecb3b466a34c8c872148e7c1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2b5f3ecb3b466a34c8c872148e7c1f");
            return;
        }
        this.m = new d(this);
        this.n = new Runnable() { // from class: com.sankuai.waimai.store.widget.searchtip.SearchTipView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0a24aae7c5e4179b3eb81685065bb1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0a24aae7c5e4179b3eb81685065bb1f");
                } else if (com.sankuai.waimai.store.util.b.a(SearchTipView.this.c)) {
                } else {
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.a(((SCBaseActivity) SearchTipView.this.c).w()));
                }
            }
        };
    }

    @TargetApi(21)
    public SearchTipView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8cc25c61dde6b20e2e836d1fc10f91f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8cc25c61dde6b20e2e836d1fc10f91f");
            return;
        }
        this.m = new d(this);
        this.n = new Runnable() { // from class: com.sankuai.waimai.store.widget.searchtip.SearchTipView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0a24aae7c5e4179b3eb81685065bb1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0a24aae7c5e4179b3eb81685065bb1f");
                } else if (com.sankuai.waimai.store.util.b.a(SearchTipView.this.c)) {
                } else {
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.a(((SCBaseActivity) SearchTipView.this.c).w()));
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public final View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9fdb15023aeb96dc46b13e380ba04aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9fdb15023aeb96dc46b13e380ba04aa");
        }
        this.g = new HorizontalFlowLayout(getContext());
        this.g.a(20, 8, 0, false);
        this.g.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        addView(this.g, layoutParams);
        this.f = new com.sankuai.waimai.store.widget.searchtip.b(new a());
        return this;
    }

    public void setOnWidgetEventListener(c cVar) {
        this.i = cVar;
    }

    public void setOnSearchTipResultListener(b bVar) {
        this.j = bVar;
    }

    public void setInDataParam(@NonNull com.sankuai.waimai.store.param.a aVar) {
        this.h = aVar;
    }

    public final void a(RecommendSearchResponse recommendSearchResponse) {
        Object[] objArr = {recommendSearchResponse};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3083b2f2cbbef83bcd53f148f9776b8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3083b2f2cbbef83bcd53f148f9776b8b");
            return;
        }
        com.sankuai.waimai.store.widget.searchtip.b bVar = this.f;
        String w = ((SCBaseActivity) this.c).w();
        Object[] objArr2 = {recommendSearchResponse, w};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widget.searchtip.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "669d69d1a3ea853ee1b84f589957dcfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "669d69d1a3ea853ee1b84f589957dcfe");
        } else {
            Object[] objArr3 = {recommendSearchResponse, w};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.widget.searchtip.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "6533f69ac3aae288673e8ef8f58c694f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "6533f69ac3aae288673e8ef8f58c694f");
            } else {
                if (recommendSearchResponse == null || com.sankuai.shangou.stone.util.a.b(recommendSearchResponse.searchKeywordList)) {
                    bVar.b.a(false);
                } else {
                    bVar.b.a(true);
                    bVar.b.a(recommendSearchResponse);
                }
                if (!o.f()) {
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.model.a(w));
                }
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = e;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ed09ce47f1a0c6a7abdc4f7f3915b0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ed09ce47f1a0c6a7abdc4f7f3915b0e5");
        } else if (o.m() && (this.h.aY || this.h.aX)) {
            this.m.post(this.n);
        } else {
            for (int i = 1; i <= 3; i++) {
                this.m.postDelayed(this.n, i * 200);
            }
            this.m.postDelayed(this.n, this.h.aX ? 1200L : 1800L);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements com.sankuai.waimai.store.widget.searchtip.a {
        public static ChangeQuickRedirect a;
        public List<HorizontalFlowLayout.c> b;
        public int c;
        public int d;
        public int e;

        private a() {
            Object[] objArr = {SearchTipView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da7ff2d6b2680905c0340cddabafd47", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da7ff2d6b2680905c0340cddabafd47");
                return;
            }
            this.b = new ArrayList();
            this.c = Color.parseColor("#00000000");
            this.d = Color.parseColor("#F5F5F6");
            this.e = Color.parseColor("#222426");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
        /* JADX WARN: Type inference failed for: r0v45, types: [android.view.View] */
        @Override // com.sankuai.waimai.store.widget.searchtip.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@android.support.annotation.NonNull final com.sankuai.waimai.store.repository.model.RecommendSearchResponse r24) {
            /*
                Method dump skipped, instructions count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.widget.searchtip.SearchTipView.a.a(com.sankuai.waimai.store.repository.model.RecommendSearchResponse):void");
        }

        @Override // com.sankuai.waimai.store.widget.searchtip.a
        public final void a(@NonNull PoiChannelBackgroundConfig poiChannelBackgroundConfig) {
            boolean z = false;
            Object[] objArr = {poiChannelBackgroundConfig};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14dd34d364a59f1a73bbeb1d81c3294d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14dd34d364a59f1a73bbeb1d81c3294d");
                return;
            }
            SearchTipView.this.k = poiChannelBackgroundConfig;
            if (SearchTipView.this.k != null) {
                Integer a2 = com.sankuai.shangou.stone.util.d.a(SearchTipView.this.k.hotSearchLabelBgColor);
                if (a2 != null && this.d != a2.intValue()) {
                    this.d = a2.intValue();
                    z = true;
                }
                Integer a3 = com.sankuai.shangou.stone.util.d.a(SearchTipView.this.k.hotSearchLabelFontColor);
                if (a3 != null && this.e != a3.intValue()) {
                    this.e = a3.intValue();
                    z = true;
                }
            }
            if (com.sankuai.shangou.stone.util.a.b(this.b) || !z) {
                return;
            }
            for (HorizontalFlowLayout.c cVar : this.b) {
                if (cVar != null && (cVar.a instanceof TextView)) {
                    a((TextView) cVar.a, cVar.a.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10), this.c, this.d, this.e);
                }
            }
        }

        @Override // com.sankuai.waimai.store.widget.searchtip.a
        public final void a(String str, String str2, String str3) {
            boolean z = false;
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e5e315d853a675ad0f18c7ed4f9964", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e5e315d853a675ad0f18c7ed4f9964");
                return;
            }
            SearchTipView.this.l = new PoiVerticalityDataResponse.Promotion();
            SearchTipView.this.l.hotSearchLabelBgColor = str2;
            SearchTipView.this.l.hotSearchLabelFontColor = str3;
            if (SearchTipView.this.l != null) {
                Integer a2 = com.sankuai.shangou.stone.util.d.a(SearchTipView.this.l.hotSearchLabelBgColor);
                if (a2 != null && this.d != a2.intValue()) {
                    this.d = a2.intValue();
                    z = true;
                }
                Integer a3 = com.sankuai.shangou.stone.util.d.a(SearchTipView.this.l.hotSearchLabelFontColor);
                if (a3 != null && this.e != a3.intValue()) {
                    this.e = a3.intValue();
                    z = true;
                }
            }
            if (com.sankuai.shangou.stone.util.a.b(this.b) || !z) {
                return;
            }
            for (HorizontalFlowLayout.c cVar : this.b) {
                if (cVar != null && (cVar.a instanceof TextView)) {
                    a((TextView) cVar.a, cVar.a.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10), this.c, this.d, this.e);
                }
            }
        }

        private void a(TextView textView, float f, int i, int i2, int i3) {
            Object[] objArr = {textView, Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f546d90176729dad18c1dd4651e45f66", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f546d90176729dad18c1dd4651e45f66");
                return;
            }
            Drawable a2 = new e.a().b(1).a(f).c(i2).a(i).a();
            textView.setTextColor(i3);
            textView.setBackground(a2);
        }

        @Override // com.sankuai.waimai.store.widget.searchtip.a
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b4b9a0c3e2a2c922a06a2e3863821c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b4b9a0c3e2a2c922a06a2e3863821c");
                return;
            }
            if (z) {
                u.a(SearchTipView.this.g);
            } else {
                SearchTipView.this.g.removeAllViews();
                u.c(SearchTipView.this.g);
            }
            if (SearchTipView.this.j != null) {
                SearchTipView.this.j.a(z);
            }
        }

        String a(int i, @NonNull List<RecommendSearchResponse.SearchKeyword> list) {
            Object[] objArr = {Integer.valueOf(i), list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a5b592ba195e5a688913c138068b6e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a5b592ba195e5a688913c138068b6e");
            }
            int min = Math.min(i, com.sankuai.shangou.stone.util.a.a((List) list));
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < min; i2++) {
                RecommendSearchResponse.SearchKeyword searchKeyword = (RecommendSearchResponse.SearchKeyword) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2);
                if (searchKeyword != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("keyword", searchKeyword.viewKeyword);
                        jSONObject.put("index", searchKeyword.index);
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString();
        }
    }
}
