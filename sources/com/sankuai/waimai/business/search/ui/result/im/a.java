package com.sankuai.waimai.business.search.ui.result.im;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.model.DrugImEntranceEntity;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    protected SearchShareData b;
    private ImageView c;
    private LinearLayout d;
    private TextView e;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fadc275c06406fd540a40e8c79f8b5fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fadc275c06406fd540a40e8c79f8b5fb");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64dbcea4f2dd06cce85d11d011ba5ff0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64dbcea4f2dd06cce85d11d011ba5ff0");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_nox_search_drug_im_entrance, viewGroup, true);
        this.c = (ImageView) inflate.findViewById(R.id.im_entrance_bg_img);
        this.d = (LinearLayout) inflate.findViewById(R.id.im_entrance_right_top_container);
        this.e = (TextView) inflate.findViewById(R.id.im_entrance_right_top_text);
        this.d.setBackgroundResource(R.drawable.wm_nox_search_drug_im_entrance_unread_number);
        this.d.setVisibility(8);
        return inflate;
    }

    public final void a(@NonNull DrugImEntranceEntity drugImEntranceEntity, SearchShareData searchShareData) {
        Object[] objArr = {drugImEntranceEntity, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bee3a41e11aa78e6af960fbae8c837c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bee3a41e11aa78e6af960fbae8c837c");
            return;
        }
        this.b = searchShareData;
        if (!TextUtils.isEmpty(drugImEntranceEntity.picUrl)) {
            this.c.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.y;
            a2.c = drugImEntranceEntity.picUrl;
            a2.a(this.c);
            return;
        }
        this.c.setVisibility(8);
    }

    public final void a(@NonNull DrugImEntranceEntity drugImEntranceEntity) {
        Object[] objArr = {drugImEntranceEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1e7f81f645475fa3668ab5f72796594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1e7f81f645475fa3668ab5f72796594");
            return;
        }
        h.a(this.y, 2, "c_nfqbfvw", "b_waimai_1f89fno0_mv", AppUtil.generatePageInfoKey(this.y), a());
        if (h() != null) {
            h().setOnClickListener(new View$OnClickListenerC0867a(drugImEntranceEntity, a()));
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db73879ba0fd66a3896a4b231d297e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db73879ba0fd66a3896a4b231d297e10");
        } else if (this.d == null || this.e == null) {
        } else {
            if (i <= 0) {
                this.d.setVisibility(8);
                return;
            }
            this.d.setVisibility(0);
            this.e.setText(i > 99 ? "99+" : String.valueOf(i));
            if (this.b != null) {
                this.b.q = i;
            }
        }
    }

    private Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c428a3498189bccdbc713c02d62c9b24", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c428a3498189bccdbc713c02d62c9b24");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stid", this.b.d);
        hashMap.put("source_type", 27);
        hashMap.put("new_message_badge", Integer.valueOf(this.b.q > 0 ? 1 : 0));
        hashMap.put("type", 1);
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.im.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class View$OnClickListenerC0867a implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        private DrugImEntranceEntity c;
        private Map<String, Object> d;

        public View$OnClickListenerC0867a(@NonNull DrugImEntranceEntity drugImEntranceEntity, @NonNull Map<String, Object> map) {
            Object[] objArr = {a.this, drugImEntranceEntity, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb16fb41fdc5d12c16e552616a662a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb16fb41fdc5d12c16e552616a662a6");
                return;
            }
            this.c = drugImEntranceEntity;
            this.d = map;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4cd4aa83beb4de5524ab905e1091ebb", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4cd4aa83beb4de5524ab905e1091ebb");
            } else if (a.this.y == null || TextUtils.isEmpty(this.c.scheme)) {
            } else {
                com.sankuai.waimai.foundation.router.a.a(a.this.y, this.c.scheme);
                h.a(a.this.y, 1, "c_nfqbfvw", "b_waimai_1f89fno0_mc", AppUtil.generatePageInfoKey(a.this.y), this.d);
            }
        }
    }
}
