package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.goods.list.base.e;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.drug.util.d;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends e {
    public static ChangeQuickRedirect c;
    public InterfaceC1150a d;
    private c e;
    private View f;
    private TextView g;
    private TextView h;
    private TextView i;
    private Map<String, Object> j;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1150a {
        void a();
    }

    public a(@NonNull c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7744859bc618c432f71d803abd61aeb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7744859bc618c432f71d803abd61aeb3");
        } else {
            this.e = cVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9900ec5a0b15106527546e300a712e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9900ec5a0b15106527546e300a712e");
        }
        this.f = layoutInflater.inflate(R.layout.wm_drug_basic_shop_header_info, viewGroup, false);
        this.g = (TextView) this.f.findViewById(R.id.poi_page_header_poi_name);
        this.h = (TextView) this.f.findViewById(R.id.poi_page_header_score);
        this.i = (TextView) this.f.findViewById(R.id.poi_page_header_poi_bulletin);
        ((UniversalImageView) this.f.findViewById(R.id.img_poi)).setBorderColor(b.b(getContext(), R.color.wm_sg_color_E3E2E1));
        return this.f;
    }

    public final void a(final Poi poi) {
        String string;
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d4b05cf8b826c46efe37f06220d922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d4b05cf8b826c46efe37f06220d922");
        } else if (poi == null) {
        } else {
            this.j = new HashMap();
            this.j.put("poi_id", poi.getOfficialPoiId());
            this.j.put("stid", poi.abExpInfo);
            Object[] objArr2 = {poi};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c4eacb0669a5d45cdc572f113d7426f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c4eacb0669a5d45cdc572f113d7426f");
            } else {
                this.g.setText(poi.name);
            }
            Object[] objArr3 = {poi};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd69dd52c4fcba7c09ff731eec839549", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd69dd52c4fcba7c09ff731eec839549");
            } else if (poi.basicStyleType == 1 && i.d(Double.valueOf(poi.score), Double.valueOf(0.0d)) && poi.commentNumber > 0) {
                this.h.setVisibility(0);
                TextView textView = this.h;
                Context context = this.mContext;
                Object[] objArr4 = new Object[1];
                objArr4[0] = i.d(Double.valueOf(poi.score), Double.valueOf(5.0d)) ? Double.valueOf(5.0d) : String.valueOf(poi.score);
                textView.setText(context.getString(R.string.wm_sc_poi_rating, objArr4));
                a(0, "b_x9DU9", poi.score);
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "af52c223759710ea123a23a52d55cf39", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "af52c223759710ea123a23a52d55cf39");
                            return;
                        }
                        a.this.a(1, "b_suD8h", poi.score);
                        if (a.this.d != null) {
                            a.this.d.a();
                        }
                    }
                });
            } else {
                this.h.setVisibility(8);
            }
            Object[] objArr5 = {poi};
            ChangeQuickRedirect changeQuickRedirect4 = c;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "b88fd4a9640d8b28a284e9aa65b55974", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "b88fd4a9640d8b28a284e9aa65b55974");
            } else if (poi.getNewPoiLabels() != null) {
                a(0, "b_pgunu2j9");
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr6 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect5, false, "850eaaa15e417bd6efbd4ba46d676547", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect5, false, "850eaaa15e417bd6efbd4ba46d676547");
                            return;
                        }
                        a.this.a(1, "b_6ajz5myo");
                        d.a((SCBaseActivity) a.this.mContext, a.this.b.b.getNewPoiLabels(), a.this.b.b.getRestBulletin());
                    }
                });
            }
            Object[] objArr6 = {poi};
            ChangeQuickRedirect changeQuickRedirect5 = c;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect5, false, "1e1b46b68f397541cf887042616ba55a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect5, false, "1e1b46b68f397541cf887042616ba55a");
                return;
            }
            if (!TextUtils.isEmpty(poi.getRestBulletin())) {
                string = poi.getRestBulletin();
            } else {
                string = this.mContext.getString(R.string.wm_sc_common_welcome_content);
            }
            this.i.setText(this.mContext.getString(R.string.wm_sc_common_notice_content, string));
        }
    }

    void a(int i, String str, double d) {
        com.sankuai.waimai.store.callback.a a;
        Object[] objArr = {Integer.valueOf(i), str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0f866fee11e892d020ce77379bd44aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0f866fee11e892d020ce77379bd44aa");
            return;
        }
        if (i == 0) {
            a = com.sankuai.waimai.store.manager.judas.b.b(this.e.b(), str);
        } else {
            a = com.sankuai.waimai.store.manager.judas.b.a(this.e.b(), str);
        }
        a.b(this.j).a("score", Double.valueOf(d)).a();
    }

    void a(int i, String str) {
        com.sankuai.waimai.store.callback.a a;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57c7d4d9ab76623982456d543e55cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57c7d4d9ab76623982456d543e55cd1");
            return;
        }
        if (i == 0) {
            a = com.sankuai.waimai.store.manager.judas.b.b(this.e.b(), str);
        } else {
            a = com.sankuai.waimai.store.manager.judas.b.a(this.e.b(), str);
        }
        a.b(this.j).a("spu_id", "-999").a();
    }
}
