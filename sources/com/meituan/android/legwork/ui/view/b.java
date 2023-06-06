package com.meituan.android.legwork.ui.view;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.android.legwork.bean.im.IMMsgTemplate;
import com.meituan.android.legwork.ui.adapter.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.imui.IMUIManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends RelativeLayout implements h.a {
    public static ChangeQuickRedirect a;
    public RecyclerView b;
    private List<IMMsgTemplate> c;
    private h d;
    private Map<String, Object> e;

    public b(Context context, List<IMMsgTemplate> list, Map<String, Object> map) {
        super(context);
        Object[] objArr = {context, list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8966bdb200203660cac219afabd4cc69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8966bdb200203660cac219afabd4cc69");
            return;
        }
        this.c = list;
        this.e = map;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d82a2ce4ae417fc76db034ea8f495635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d82a2ce4ae417fc76db034ea8f495635");
            return;
        }
        this.d = new h();
        this.d.c = this;
        h hVar = this.d;
        List<IMMsgTemplate> list2 = this.c;
        Object[] objArr3 = {list2};
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "4f16fe80b648d5989b4f647c633eecdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "4f16fe80b648d5989b4f647c633eecdd");
        } else {
            hVar.b = list2;
            hVar.notifyDataSetChanged();
        }
        this.b = (RecyclerView) LayoutInflater.from(getContext()).inflate(R.layout.legwork_im_msg_template, (ViewGroup) this, true).findViewById(R.id.msg_template_list);
        this.b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.b.setAdapter(this.d);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51f9cfc91be7d624cebee237eb6b3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51f9cfc91be7d624cebee237eb6b3b9");
        } else {
            super.onFinishInflate();
        }
    }

    @Override // com.meituan.android.legwork.ui.adapter.h.a
    public final void a(IMMsgTemplate iMMsgTemplate) {
        Object[] objArr = {iMMsgTemplate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae1800686d1dbd196b2b9d234a929be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae1800686d1dbd196b2b9d234a929be");
        } else if (iMMsgTemplate == null) {
        } else {
            TextMessage a2 = com.sankuai.xm.imui.common.util.c.a(iMMsgTemplate.msg);
            HashMap hashMap = new HashMap(2);
            hashMap.put("msgTemplateId", Long.valueOf(iMMsgTemplate.id));
            a2.appendExtension(hashMap);
            IMUIManager.a().a((IMMessage) a2, false);
            if (this.e != null) {
                this.e.put("replay_temp", Long.valueOf(iMMsgTemplate.id));
            }
            com.meituan.android.legwork.statistics.a.a(this, "b_9hvewib2", "c_q4u2ijua", this.e);
        }
    }
}
