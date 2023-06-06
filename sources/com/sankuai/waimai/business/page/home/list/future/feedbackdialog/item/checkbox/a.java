package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.checkbox.RooCheckBox;
import com.meituan.roodesign.widgets.radiobutton.RooRadioButton;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.Answer;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.SubmitQuestionBean;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    Map<String, Answer> b;
    Set<String> c;
    int d;
    long e;
    Set<Integer> f;
    boolean g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4254e067f8d2d317d76883db416d41dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4254e067f8d2d317d76883db416d41dd");
            return;
        }
        this.f = new HashSet();
        this.g = false;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        return this.d;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a7e5983e017f8d711e7b9d489c2f8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a7e5983e017f8d711e7b9d489c2f8d");
        }
        if (i == 2) {
            return new C0784a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_feedback_checkbox_item, viewGroup, false));
        }
        if (i == 1) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_feedback_radiobutton_item, viewGroup, false));
        }
        return new C0784a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_feedback_checkbox_item, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, @SuppressLint({"RecyclerView"}) final int i) {
        Map<String, String> answerToMap;
        Map<String, String> answerToMap2;
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641af49de01f4595f97d4229bd23c3d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641af49de01f4595f97d4229bd23c3d2");
        } else if (this.c == null || this.c.size() <= 0) {
        } else {
            final String a2 = a(i);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            final Answer answer = this.b.get(a2);
            if ((sVar instanceof C0784a) && answer != null) {
                C0784a c0784a = (C0784a) sVar;
                c0784a.a.setText(answer.qAnsText);
                if (this.g) {
                    c0784a.a.setChecked(this.f.contains(Integer.valueOf(i)));
                } else if (com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b) {
                    com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a3 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.e);
                    SubmitQuestionBean c = a3.c(sb.toString());
                    if (c != null && (answerToMap2 = c.answerToMap()) != null && answerToMap2.containsKey(a2)) {
                        this.f.add(Integer.valueOf(i));
                        c0784a.a.setChecked(true);
                    }
                }
                c0784a.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04f7b13d0db35aa9561df36e1b06aa25", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04f7b13d0db35aa9561df36e1b06aa25");
                            return;
                        }
                        a.this.g = true;
                        if (a.this.f.contains(Integer.valueOf(i))) {
                            a.this.f.remove(Integer.valueOf(i));
                            com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a4 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(a.this.e);
                            String sb3 = sb2.toString();
                            String str = a2;
                            String str2 = answer.qAnsId;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(answer.qAnsValue);
                            a4.a(sb3, str, "", str2, sb4.toString(), a.this.b);
                        } else {
                            com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a5 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(a.this.e);
                            String sb6 = sb5.toString();
                            String str3 = a2;
                            String str4 = answer.qAnsText;
                            String str5 = answer.qAnsId;
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(answer.qAnsValue);
                            a5.a(sb6, str3, str4, str5, sb7.toString(), a.this.b);
                            a.this.f.add(Integer.valueOf(i));
                        }
                        a.this.notifyDataSetChanged();
                    }
                });
            } else if (!(sVar instanceof b) || answer == null) {
            } else {
                b bVar = (b) sVar;
                bVar.a.setText(answer.qAnsText);
                if (this.g) {
                    bVar.a.setChecked(this.f.contains(Integer.valueOf(i)));
                } else if (com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b) {
                    com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a4 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.e);
                    SubmitQuestionBean c2 = a4.c(sb2.toString());
                    if (c2 != null && (answerToMap = c2.answerToMap()) != null && answerToMap.containsKey(a2)) {
                        this.f.add(Integer.valueOf(i));
                        bVar.a.setChecked(true);
                    }
                }
                bVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b33efb94641e9882d1dc83a2b919f87", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b33efb94641e9882d1dc83a2b919f87");
                            return;
                        }
                        a.this.g = true;
                        if (!a.this.f.isEmpty()) {
                            com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a5 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(a.this.e);
                            a5.d(sb3.toString());
                            a.this.f.clear();
                        }
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a6 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(a.this.e);
                        String sb5 = sb4.toString();
                        String str = a2;
                        String str2 = answer.qAnsText;
                        String str3 = answer.qAnsId;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(answer.qAnsValue);
                        a6.a(sb5, str, str2, str3, sb6.toString(), null);
                        a.this.f.add(Integer.valueOf(i));
                        a.this.notifyDataSetChanged();
                    }
                });
            }
        }
    }

    private String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fedda385dc55ee6031c727517744d638", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fedda385dc55ee6031c727517744d638");
        }
        Iterator<String> it = this.c.iterator();
        for (int i2 = 0; i2 < i; i2++) {
            if (it.hasNext()) {
                it.next();
            }
        }
        return it.hasNext() ? it.next() : "";
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50f5e2e3efbd177a131c3abba0c4c2b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50f5e2e3efbd177a131c3abba0c4c2b2")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0784a extends RecyclerView.s {
        public RooCheckBox a;
        public LinearLayout b;

        public C0784a(@NonNull View view) {
            super(view);
            this.a = (RooCheckBox) view.findViewById(R.id.cb_item);
            this.b = (LinearLayout) view.findViewById(R.id.ll_checkbox);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends RecyclerView.s {
        public RooRadioButton a;
        public LinearLayout b;

        public b(@NonNull View view) {
            super(view);
            this.a = (RooRadioButton) view.findViewById(R.id.rb_item);
            this.b = (LinearLayout) view.findViewById(R.id.ll_radiobutton);
        }
    }
}
