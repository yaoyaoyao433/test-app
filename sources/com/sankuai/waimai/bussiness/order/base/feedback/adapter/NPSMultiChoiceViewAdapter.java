package com.sankuai.waimai.bussiness.order.base.feedback.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.foundation.utils.ah;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NPSMultiChoiceViewAdapter extends RecyclerView.a<b> {
    public static ChangeQuickRedirect a = null;
    private static final String g = "NPSMultiChoiceViewAdapter";
    public List<c.C0753c> b;
    public int c;
    public boolean d;
    public String e;
    public a f;
    private Context h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public @interface ItemType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view);

        void a(View view, int i, c.C0753c c0753c);
    }

    public static /* synthetic */ int c(NPSMultiChoiceViewAdapter nPSMultiChoiceViewAdapter) {
        int i = nPSMultiChoiceViewAdapter.c;
        nPSMultiChoiceViewAdapter.c = i + 1;
        return i;
    }

    public static /* synthetic */ int d(NPSMultiChoiceViewAdapter nPSMultiChoiceViewAdapter) {
        int i = nPSMultiChoiceViewAdapter.c;
        nPSMultiChoiceViewAdapter.c = i - 1;
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(@NonNull b bVar, int i) {
        final b bVar2 = bVar;
        Object[] objArr = {bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6382da309f9f848acb71a9d0bf0fb66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6382da309f9f848acb71a9d0bf0fb66b");
            return;
        }
        switch (getItemViewType(i)) {
            case 0:
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b762472f82fc59de6e9245c602ac98da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b762472f82fc59de6e9245c602ac98da");
                    return;
                } else {
                    ah.a(bVar2.b, this.e);
                    return;
                }
            case 1:
                final int i2 = i - 1;
                Object[] objArr3 = {bVar2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ed55e361e426048b2660292c1c2ca3f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ed55e361e426048b2660292c1c2ca3f");
                    return;
                }
                c.C0753c c0753c = this.b.get(i2);
                bVar2.d.setVisibility(0);
                bVar2.f.setText(c0753c.b);
                bVar2.e.setSelected(c0753c.d == 1);
                bVar2.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.adapter.NPSMultiChoiceViewAdapter.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "765e4c603b951b717aa114a953ea70ce", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "765e4c603b951b717aa114a953ea70ce");
                        } else if (NPSMultiChoiceViewAdapter.this.f != null) {
                            NPSMultiChoiceViewAdapter.this.f.a(bVar2.e, i2, (c.C0753c) NPSMultiChoiceViewAdapter.this.b.get(i2));
                            ((c.C0753c) NPSMultiChoiceViewAdapter.this.b.get(i2)).d = bVar2.e.isSelected() ? 1 : 0;
                            if (bVar2.e.isSelected()) {
                                NPSMultiChoiceViewAdapter.c(NPSMultiChoiceViewAdapter.this);
                            } else {
                                NPSMultiChoiceViewAdapter.d(NPSMultiChoiceViewAdapter.this);
                            }
                            NPSMultiChoiceViewAdapter.this.notifyDataSetChanged();
                        }
                    }
                });
                return;
            case 2:
                Object[] objArr4 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fb268dd540973bfd4478ad709c55c8e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fb268dd540973bfd4478ad709c55c8e1");
                    return;
                }
                bVar2.c.setVisibility(0);
                if (this.c > 0) {
                    bVar2.c.setEnabled(true);
                    bVar2.c.setTextColor(Color.parseColor("#222426"));
                    bVar2.c.setBackgroundResource(R.drawable.wm_order_multi_choice_selector_button_bg);
                } else {
                    bVar2.c.setEnabled(false);
                    bVar2.c.setTextColor(Color.parseColor("#FFFFFF"));
                    bVar2.c.setBackgroundResource(R.drawable.wm_order_multi_choice_selector_unselector_button_bg);
                }
                if (this.d) {
                    bVar2.c.setText(this.h.getString(R.string.wm_order_question_feedback_submit));
                } else {
                    bVar2.c.setText(this.h.getString(R.string.wm_order_question_feedback_next));
                }
                bVar2.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.adapter.NPSMultiChoiceViewAdapter.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8cd906d987d7e6572d35df28e7f3c0a8", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8cd906d987d7e6572d35df28e7f3c0a8");
                        } else if (NPSMultiChoiceViewAdapter.this.f != null) {
                            NPSMultiChoiceViewAdapter.this.f.a(bVar2.c);
                        }
                    }
                });
                return;
            default:
                return;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public /* synthetic */ b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f66062ae2e2d5a4e89e662d51d41b0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f66062ae2e2d5a4e89e662d51d41b0b");
        }
        if (i == 0) {
            return new b(LayoutInflater.from(this.h).inflate(R.layout.wm_order_multi_choice_question_title_item, viewGroup, false), i);
        }
        if (i == 2) {
            return new b(LayoutInflater.from(this.h).inflate(R.layout.wm_order_multi_choice_question_button_item, viewGroup, false), i);
        }
        return new b(LayoutInflater.from(this.h).inflate(R.layout.wm_order_multi_choice_question_cell_item, viewGroup, false), i);
    }

    public NPSMultiChoiceViewAdapter(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62c9e6e6bf56d01113d08704a696fe9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62c9e6e6bf56d01113d08704a696fe9");
            return;
        }
        this.b = new ArrayList();
        this.c = 0;
        this.h = context;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d872ed89156c1f895c6961a944c596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d872ed89156c1f895c6961a944c596");
            return;
        }
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).d = 0;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b23b17943d76e2814528f9474dc8eb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b23b17943d76e2814528f9474dc8eb1")).intValue();
        }
        if (i == 0) {
            return 0;
        }
        return i == getItemCount() - 1 ? 2 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d97604fb0a3f17477c012a932a2f57e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d97604fb0a3f17477c012a932a2f57e")).intValue();
        }
        if (this.b != null) {
            return this.b.size() + 2;
        }
        return 2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public TextView b;
        public TextView c;
        public LinearLayout d;
        public ImageView e;
        public TextView f;

        public b(View view, int i) {
            super(view);
            Object[] objArr = {NPSMultiChoiceViewAdapter.this, view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2076cde168ef9581995de8c46e17c482", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2076cde168ef9581995de8c46e17c482");
                return;
            }
            Object[] objArr2 = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59fda143c30eaabb4f2fea2d90fdbf8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59fda143c30eaabb4f2fea2d90fdbf8c");
                return;
            }
            switch (i) {
                case 0:
                    this.b = (TextView) view.findViewById(R.id.questionTitle);
                    return;
                case 1:
                    this.d = (LinearLayout) view.findViewById(R.id.choice_container);
                    this.e = (ImageView) view.findViewById(R.id.choice_panel);
                    this.f = (TextView) view.findViewById(R.id.choice_text);
                    return;
                case 2:
                    this.c = (TextView) view.findViewById(R.id.next_question_btn);
                    return;
                default:
                    return;
            }
        }
    }
}
