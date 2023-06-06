package com.sankuai.waimai.store.im.poi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.im.poi.listener.e;
import com.sankuai.waimai.store.im.poi.model.ImRecommendScriptInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    List<ImRecommendScriptInfo.RecommendStatementList> b;
    e c;
    public String d;
    public String e;
    private Context f;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5285b96da857f8c3793aaf2f1ceba58b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5285b96da857f8c3793aaf2f1ceba58b");
            return;
        }
        final ImRecommendScriptInfo.RecommendStatementList recommendStatementList = (ImRecommendScriptInfo.RecommendStatementList) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (recommendStatementList != null) {
            if (!TextUtils.isEmpty(recommendStatementList.statement) && !com.sankuai.shangou.stone.util.a.b(recommendStatementList.keyWordList)) {
                SpannableString spannableString = new SpannableString(recommendStatementList.statement);
                for (int i2 = 0; i2 < recommendStatementList.keyWordList.size(); i2++) {
                    String str = recommendStatementList.keyWordList.get(i2);
                    if (!TextUtils.isEmpty(str) && recommendStatementList.statement.contains(str)) {
                        int indexOf = recommendStatementList.statement.indexOf(str);
                        spannableString.setSpan(new ForegroundColorSpan(com.sankuai.waimai.store.util.b.b(this.f, R.color.wm_sg_color_FF7800)), indexOf, str.length() + indexOf, 33);
                    }
                }
                u.a(aVar2.a, spannableString);
            } else {
                u.a(aVar2.a, recommendStatementList.statement);
            }
            if (i == com.sankuai.shangou.stone.util.a.a((List) this.b) - 1) {
                u.a((View) aVar2.b, 8);
            } else {
                u.a((View) aVar2.b, 0);
            }
            if (aVar2.c != null) {
                aVar2.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.adapter.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fd3801f11dbeafb7e18f9ee981aaaf2", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fd3801f11dbeafb7e18f9ee981aaaf2");
                        } else if (b.this.c != null) {
                            b.this.c.a(b.this.b, recommendStatementList, b.this.e, b.this.d);
                        }
                    }
                });
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f58f874581f33730d952bcd5c13e37ac", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f58f874581f33730d952bcd5c13e37ac") : new a(LayoutInflater.from(this.f).inflate(R.layout.wm_sc_im_recommend_script_item, viewGroup, false));
    }

    public b(Context context, e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc391592fa289d7c0e0f2ab5260c27f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc391592fa289d7c0e0f2ab5260c27f2");
            return;
        }
        this.b = new ArrayList();
        this.f = context;
        this.c = eVar;
    }

    public final void a(List<ImRecommendScriptInfo.RecommendStatementList> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc7f321040eb13e6b0a8e1a2a49c6d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc7f321040eb13e6b0a8e1a2a49c6d7");
            return;
        }
        this.b.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.b.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2ad1392ba60034e894fa18335262c52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2ad1392ba60034e894fa18335262c52")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(this.b)) {
            return 0;
        }
        return this.b.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends RecyclerView.s {
        public TextView a;
        public TextView b;
        public LinearLayout c;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_im_recommend_script);
            this.b = (TextView) view.findViewById(R.id.tv_im_line);
            this.c = (LinearLayout) view.findViewById(R.id.ll_im_recommend_item);
        }
    }
}
