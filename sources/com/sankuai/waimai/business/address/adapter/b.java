package com.sankuai.waimai.business.address.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.address.controller.d;
import com.sankuai.waimai.log.judas.c;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends c<a> {
    public static ChangeQuickRedirect a;
    public d b;
    public Context c;
    public boolean d;
    public boolean e;
    public ArrayList<com.sankuai.waimai.business.address.model.a> f;

    @Override // com.sankuai.waimai.log.judas.c
    public final /* synthetic */ a a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a29b9702ef02025971a9097bc8b0bd", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a29b9702ef02025971a9097bc8b0bd") : new a(LayoutInflater.from(this.c).inflate(R.layout.wm_address_adapter_locate_manually, viewGroup, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01d1  */
    @Override // android.support.v7.widget.RecyclerView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.s r23, int r24) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.address.adapter.b.onBindViewHolder(android.support.v7.widget.RecyclerView$s, int):void");
    }

    public b(Context context, d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f1c407309d92afaa81de1493239868", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f1c407309d92afaa81de1493239868");
            return;
        }
        this.f = new ArrayList<>();
        this.c = context;
        this.b = dVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b281a79fd51c2caf67152899b500b55", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b281a79fd51c2caf67152899b500b55")).intValue() : this.f.size();
    }

    public final com.sankuai.waimai.business.address.model.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0649f98057cb61fe1f98a63de22a60c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.address.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0649f98057cb61fe1f98a63de22a60c");
        }
        if (i < 0 || i >= this.f.size()) {
            return null;
        }
        return this.f.get(i);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8039509efda0dd23f673bccfa7453a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8039509efda0dd23f673bccfa7453a9")).booleanValue();
        }
        if (this.f.isEmpty()) {
            return false;
        }
        this.f.clear();
        notifyDataSetChanged();
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        TextView b;
        TextView c;
        TextView d;

        private a(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a90cc5661bec8f28083a0059738351c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a90cc5661bec8f28083a0059738351c");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.txt_map_adapter_name);
            this.c = (TextView) view.findViewById(R.id.txt_map_adapter_detail);
            this.d = (TextView) view.findViewById(R.id.txt_distance);
        }
    }

    public static SpannableString a(Context context, String str, String str2, String str3, String str4) {
        String str5;
        String str6 = str2;
        Object[] objArr = {context, str, str6, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "140d304ffa7fb0307b7adb27dc51ba78", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "140d304ffa7fb0307b7adb27dc51ba78");
        }
        String str7 = "";
        if (!TextUtils.isEmpty(str)) {
            str7 = "" + str;
        }
        if (!TextUtils.isEmpty(str2)) {
            str7 = str7 + str6;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
            str6 = str7;
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || str4.contains(str3)) {
            str5 = str4;
        } else {
            str5 = str3 + str4;
        }
        SpannableString spannableString = new SpannableString(str6 + str5);
        if (!TextUtils.isEmpty(str6)) {
            spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.wm_address_black7)), 0, str6.length(), 17);
        }
        return spannableString;
    }
}
