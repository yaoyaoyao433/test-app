package com.sankuai.waimai.sa.ui.assistant.adapter;

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
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.sa.ui.assistant.adapter.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends g<C1136a> {
    public static ChangeQuickRedirect a;
    public List<com.sankuai.waimai.sa.model.a> b;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.g, android.support.v7.widget.RecyclerView.a
    /* renamed from: b */
    public C1136a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994109370cfb4a2d7efadf843dd521d6", RobustBitConfig.DEFAULT_VALUE) ? (C1136a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994109370cfb4a2d7efadf843dd521d6") : new C1136a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_chat_alarm_clock_item, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.sa.ui.assistant.adapter.g, android.support.v7.widget.RecyclerView.a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void onBindViewHolder(C1136a c1136a, int i) {
        Object[] objArr = {c1136a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "354422d67cec69e3ce0b39bf802e8761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "354422d67cec69e3ce0b39bf802e8761");
        } else if (this.b == null || i < 0 || i >= this.b.size()) {
        } else {
            com.sankuai.waimai.sa.model.a aVar = this.b.get(i);
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = C1136a.a;
            if (PatchProxy.isSupport(objArr2, c1136a, changeQuickRedirect2, false, "8419bad152cff879193a2b50b3b0d5f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1136a, changeQuickRedirect2, false, "8419bad152cff879193a2b50b3b0d5f4");
            } else if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.a)) {
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.c = aVar.a;
                    a2.i = R.drawable.wm_smart_assistant_alarm_clock_time_icon;
                    a2.j = R.drawable.wm_smart_assistant_alarm_clock_time_icon;
                    a2.a(c1136a.b);
                }
                if (!TextUtils.isEmpty(aVar.c)) {
                    c1136a.c.setText(aVar.c);
                    c1136a.c.setVisibility(0);
                } else {
                    c1136a.c.setVisibility(4);
                }
                if (!TextUtils.isEmpty(aVar.b)) {
                    c1136a.d.setText(aVar.b);
                    c1136a.d.setVisibility(0);
                    return;
                }
                c1136a.d.setVisibility(4);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0009ee470d4a52bfa0b896b89b68458a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0009ee470d4a52bfa0b896b89b68458a")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.sa.ui.assistant.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1136a extends g.a {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;
        TextView d;

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f8377be16779672d3d306d2cf35900", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f8377be16779672d3d306d2cf35900");
            }
        }

        public C1136a(View view) {
            super(view);
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23efa32dd076d99f3ed7185f1dd5e100", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23efa32dd076d99f3ed7185f1dd5e100");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.wm_smart_assistant_alarm_clock_icon);
            this.c = (TextView) view.findViewById(R.id.wm_smart_assistant_alarm_clock_time);
            this.d = (TextView) view.findViewById(R.id.wm_smart_assistant_alarm_clock_repeat);
        }
    }
}
