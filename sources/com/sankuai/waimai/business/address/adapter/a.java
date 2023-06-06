package com.sankuai.waimai.business.address.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.address.widget.a;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.d;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends BaseAdapter implements com.sankuai.waimai.business.address.widget.stickyheaderlist.b {
    public static ChangeQuickRedirect a;
    private List<AddressItem> b;
    private List<AddressItem> c;
    private List<AddressItem> d;
    private List<AddressItem> e;
    private List<Integer> f;
    private List<String> g;
    private List<Integer> h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private Context n;
    private com.sankuai.waimai.business.address.widget.a o;
    private d p;
    private final int q;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 4;
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d5e8329af61e1eacfba35652fb22107", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d5e8329af61e1eacfba35652fb22107");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = false;
        this.j = false;
        this.p = new d();
        this.q = 5;
        this.n = context;
    }

    private void b() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b046ea9e942d845f42a06ff856fb6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b046ea9e942d845f42a06ff856fb6d");
        } else if (this.i && this.j) {
            this.d.clear();
            this.f.clear();
            this.g.clear();
            this.h.clear();
            if (this.b.size() > 0) {
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    if (i2 < 5) {
                        this.d.add(this.b.get(i2));
                    } else {
                        this.e.add(this.b.get(i2));
                    }
                }
                if (this.b.size() > 5) {
                    this.d.add(new AddressItem());
                    this.m = 2;
                    i = 5;
                } else {
                    i = this.d.size() - 1;
                    this.m = 0;
                }
                this.f.add(Integer.valueOf(i));
                this.g.add(this.n.getResources().getString(R.string.wm_address_manually_history_locations));
                this.h.add(Integer.valueOf((int) R.string.wm_c_iconfont_store));
                this.k = false;
            } else {
                this.k = true;
                i = 0;
            }
            if (this.c.size() > 0) {
                this.d.addAll(this.c);
                this.f.add(Integer.valueOf(i + this.c.size()));
                this.g.add(this.n.getResources().getString(R.string.wm_address_manually_nearly_location));
                this.h.add(Integer.valueOf((int) R.string.wm_c_iconfont_14dingwei));
                this.l = false;
            } else {
                this.l = true;
            }
            notifyDataSetChanged();
        }
    }

    public final void a(List<AddressItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe8ca59e40c206ca454e834290820bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe8ca59e40c206ca454e834290820bc");
            return;
        }
        this.i = true;
        if (list == null || list.size() <= 0) {
            b();
            return;
        }
        this.b.addAll(list);
        b();
    }

    public final void b(List<AddressItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1ecaf9d43acadab829005351a05b4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1ecaf9d43acadab829005351a05b4f");
            return;
        }
        d dVar = this.p;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "59d7ec83bcb7b3cb2c651f1b0dcf0954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "59d7ec83bcb7b3cb2c651f1b0dcf0954");
        } else {
            dVar.b.clear();
        }
        this.j = true;
        if (list == null || list.size() <= 0) {
            b();
            return;
        }
        this.c.addAll(list);
        b();
    }

    @Override // com.sankuai.waimai.business.address.widget.stickyheaderlist.b
    public final View a(int i, View view, ViewGroup viewGroup) {
        C0724a c0724a;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae17a32366d1d952723294b470e99c06", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae17a32366d1d952723294b470e99c06");
        }
        if (view == null) {
            view = LayoutInflater.from(this.n).inflate(R.layout.wm_address_manually_adapter_list_header, viewGroup, false);
            c0724a = new C0724a(view);
            view.setTag(c0724a);
        } else {
            c0724a = (C0724a) view.getTag();
        }
        a(i, c0724a);
        return view;
    }

    private void a(int i, C0724a c0724a) {
        Object[] objArr = {Integer.valueOf(i), c0724a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4065612ceb8852485713e31e2fa6c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4065612ceb8852485713e31e2fa6c5");
            return;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (i <= this.f.get(i2).intValue()) {
                c0724a.b.setText(this.g.get(i2));
                c0724a.a.setText(this.h.get(i2).intValue());
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.business.address.widget.stickyheaderlist.b
    public final long a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a3a0dc3533561bec297a0f339c0aa2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a3a0dc3533561bec297a0f339c0aa2")).longValue();
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (i <= this.f.get(i2).intValue()) {
                return this.f.get(i2).intValue();
            }
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d6133fa5f2ed5594396dc34a12a72f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d6133fa5f2ed5594396dc34a12a72f")).intValue() : this.d.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6720d4523fdc330dbd9139b1ee7919", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6720d4523fdc330dbd9139b1ee7919") : this.d.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcdb8bf07e23b884e206ccd36f2071c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcdb8bf07e23b884e206ccd36f2071c4")).intValue();
        }
        if (this.k) {
            return !this.l ? 1 : -1;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (i2 == 0 && this.m == 2 && i == 5) {
                return 3;
            }
            if (i2 == 0 && this.m == 1 && i == this.e.size() + 5) {
                return 3;
            }
            if (i <= this.f.get(i2).intValue()) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        a.b bVar;
        View view2;
        int i2;
        c cVar;
        View view3;
        String str;
        Map<String, Object> map;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786c390901e558232a792750a3970e0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786c390901e558232a792750a3970e0e");
        }
        int itemViewType = getItemViewType(i);
        if (itemViewType == 3) {
            Object[] objArr2 = {view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc295dc4192ee109c4f5d3e563166544", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc295dc4192ee109c4f5d3e563166544");
            }
            if (this.o == null) {
                this.o = new com.sankuai.waimai.business.address.widget.a(this.n, new a.InterfaceC0726a() { // from class: com.sankuai.waimai.business.address.adapter.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.address.widget.a.InterfaceC0726a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "153d3a2161961cee3e2134647d503a6e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "153d3a2161961cee3e2134647d503a6e");
                            return;
                        }
                        a.this.d.addAll(5, a.this.e);
                        a.this.f.set(0, Integer.valueOf(a.this.e.size() + 5));
                        if (!a.this.l) {
                            a.this.f.set(1, Integer.valueOf(a.this.e.size() + 5 + a.this.c.size()));
                        }
                        a.this.m = 1;
                        a.this.notifyDataSetChanged();
                    }

                    @Override // com.sankuai.waimai.business.address.widget.a.InterfaceC0726a
                    public final void b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4a8ca0a09990bffb905d58f2fe340794", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4a8ca0a09990bffb905d58f2fe340794");
                            return;
                        }
                        if (a.this.e != null) {
                            a.this.d.removeAll(a.this.e);
                        }
                        a.this.f.set(0, 5);
                        if (!a.this.l) {
                            a.this.f.set(1, Integer.valueOf(a.this.c.size() + 5));
                        }
                        a.this.m = 2;
                        a.this.notifyDataSetChanged();
                    }
                });
            }
            com.sankuai.waimai.business.address.widget.a aVar = this.o;
            Object[] objArr3 = {view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.address.widget.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3e0878205a80a972cfe2237f17e8099a", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3e0878205a80a972cfe2237f17e8099a");
            }
            if (view == null) {
                view2 = LayoutInflater.from(aVar.c).inflate(R.layout.wm_address_manually_layout_expand_all, viewGroup, false);
                view2.setOnClickListener(aVar);
                bVar = new a.b();
                bVar.a = (TextView) view2.findViewById(R.id.txt_expand);
                bVar.b = (ImageView) view2.findViewById(R.id.img_expand);
                view2.setTag(bVar);
            } else {
                bVar = (a.b) view.getTag();
                view2 = view;
            }
            if (aVar.b) {
                bVar.b.setImageResource(R.drawable.wm_address_map_arrow_show_list_up);
                bVar.a.setText(R.string.wm_address_fold_down);
            } else {
                bVar.b.setImageResource(R.drawable.waimai_addrsdk_map_arrow_down);
                bVar.a.setText(R.string.wm_address_manually_expand_history_locations);
            }
            return view2;
        }
        switch (itemViewType) {
            case 0:
                Object[] objArr4 = {Integer.valueOf(i), view, viewGroup};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "98904fc6a1d04bbdddd2d43abbeb82ce", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "98904fc6a1d04bbdddd2d43abbeb82ce");
                }
                View inflate = LayoutInflater.from(this.n).inflate(R.layout.wm_address_adapter_history_delivery_list, viewGroup, false);
                b bVar2 = new b(inflate);
                inflate.setTag(bVar2);
                AddressItem addressItem = this.d.get(i);
                Object[] objArr5 = {addressItem};
                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "c3353adb86e9d78cb18335846334a8c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "c3353adb86e9d78cb18335846334a8c8");
                    return inflate;
                }
                final com.sankuai.waimai.business.address.controller.a aVar2 = bVar2.b;
                Object[] objArr6 = {addressItem, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.address.controller.a.a;
                if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "7b064d71a6a5156630a793f6c106ca8b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "7b064d71a6a5156630a793f6c106ca8b");
                    return inflate;
                } else if (addressItem != null) {
                    if (!TextUtils.isEmpty(addressItem.userName)) {
                        aVar2.b.setText(addressItem.userName);
                        aVar2.b.setVisibility(0);
                    } else {
                        aVar2.b.setVisibility(8);
                    }
                    if (TextUtils.isEmpty(addressItem.gender)) {
                        aVar2.c.setVisibility(8);
                    } else {
                        aVar2.c.setVisibility(0);
                        aVar2.c.setText(addressItem.gender);
                    }
                    ah.a(aVar2.d, addressItem.phone);
                    if (!TextUtils.isEmpty(addressItem.phoneInterCode)) {
                        ah.a(aVar2.d, "+" + addressItem.phoneInterCode + Constants.SPACE + addressItem.phone);
                    }
                    if (!TextUtils.isEmpty(addressItem.addrBrief)) {
                        String str2 = addressItem.addrBrief + StringUtil.SPACE + addressItem.addrBuildingNum;
                        if (addressItem.addressType == 1 && aVar2.i == 2) {
                            str2 = com.meituan.android.singleton.b.a.getString(R.string.wm_address_pick_up_address_with_colon, str2);
                        }
                        if (!TextUtils.isEmpty(addressItem.categoryIcon)) {
                            final TextView textView = aVar2.e;
                            String str3 = addressItem.categoryIcon;
                            final int i3 = addressItem.category;
                            Object[] objArr7 = {textView, str2, str3, Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.address.controller.a.a;
                            if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "282057ab6ff1e84cf9a2e79a30ae7c3a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "282057ab6ff1e84cf9a2e79a30ae7c3a");
                            } else {
                                final Context context = textView.getContext();
                                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                a2.b = context;
                                a2.c = str3;
                                final String str4 = str2;
                                a2.a(new b.a() { // from class: com.sankuai.waimai.business.address.controller.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                    public final void a(Bitmap bitmap) {
                                        String str5;
                                        Object[] objArr8 = {bitmap};
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "850a08a28718c9c3e7aeb94107394e7b", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "850a08a28718c9c3e7aeb94107394e7b");
                                            return;
                                        }
                                        try {
                                            if (textView == null || TextUtils.isEmpty(str4)) {
                                                return;
                                            }
                                            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                                            int a3 = g.a(context, 18.0f);
                                            bitmapDrawable.setBounds(0, 0, (int) (a3 * (bitmapDrawable.getIntrinsicWidth() / bitmapDrawable.getIntrinsicHeight())), a3);
                                            com.sankuai.waimai.addrsdk.view.a aVar3 = new com.sankuai.waimai.addrsdk.view.a(bitmapDrawable);
                                            SpannableString spannableString = new SpannableString("     " + str4);
                                            spannableString.setSpan(aVar3, 0, 4, 33);
                                            textView.setText(spannableString);
                                            TextView textView2 = textView;
                                            StringBuilder sb = new StringBuilder();
                                            a aVar4 = aVar2;
                                            int i4 = i3;
                                            Object[] objArr9 = {Integer.valueOf(i4)};
                                            ChangeQuickRedirect changeQuickRedirect9 = a.a;
                                            if (!PatchProxy.isSupport(objArr9, aVar4, changeQuickRedirect9, false, "b4568fd1d27c029a0a02ab29b59eaf32", RobustBitConfig.DEFAULT_VALUE)) {
                                                switch (i4) {
                                                    case 1:
                                                        str5 = "家";
                                                        break;
                                                    case 2:
                                                        str5 = "公司";
                                                        break;
                                                    case 3:
                                                        str5 = "学校";
                                                        break;
                                                    case 4:
                                                        str5 = "外卖柜";
                                                        break;
                                                    default:
                                                        str5 = "";
                                                        break;
                                                }
                                            } else {
                                                str5 = (String) PatchProxy.accessDispatch(objArr9, aVar4, changeQuickRedirect9, false, "b4568fd1d27c029a0a02ab29b59eaf32");
                                            }
                                            sb.append(str5);
                                            sb.append(StringUtil.SPACE);
                                            sb.append(str4);
                                            textView2.setContentDescription(sb.toString());
                                        } catch (Throwable unused) {
                                            textView.setText(str4);
                                        }
                                    }

                                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                    public final void a() {
                                        Object[] objArr8 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "276428454abec2c53656fb51c90bc163", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "276428454abec2c53656fb51c90bc163");
                                        } else {
                                            textView.setText(str4);
                                        }
                                    }
                                });
                            }
                        } else {
                            aVar2.e.setText(str2);
                        }
                        aVar2.e.setVisibility(0);
                    } else {
                        aVar2.e.setVisibility(8);
                    }
                    if (aVar2.i == 2) {
                        if (!TextUtils.isEmpty(addressItem.addressTip)) {
                            aVar2.g.setVisibility(0);
                            aVar2.g.setText(addressItem.addressTip);
                        } else {
                            aVar2.g.setVisibility(8);
                        }
                    }
                    if (aVar2.i == 2 || aVar2.i == 0) {
                        if (addressItem.addressType == 0) {
                            i2 = 1;
                            if (aVar2.e.getMaxLines() > 1) {
                                aVar2.e.setSingleLine(false);
                                aVar2.h.setVisibility(0);
                                return inflate;
                            }
                        } else {
                            i2 = 1;
                        }
                        if (addressItem.addressType == i2) {
                            aVar2.e.setSingleLine(false);
                            aVar2.h.setVisibility(8);
                            return inflate;
                        }
                        return inflate;
                    }
                    return inflate;
                } else {
                    return inflate;
                }
            case 1:
                Object[] objArr8 = {Integer.valueOf(i), view, viewGroup};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "aedaf8ab6e61895d2b76db4609cf6417", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "aedaf8ab6e61895d2b76db4609cf6417");
                }
                if (view == null) {
                    View inflate2 = LayoutInflater.from(this.n).inflate(R.layout.wm_address_manually_nealy_list_item, viewGroup, false);
                    cVar = new c(inflate2);
                    inflate2.setTag(cVar);
                    view3 = inflate2;
                } else {
                    cVar = (c) view.getTag();
                    view3 = view;
                }
                AddressItem addressItem2 = this.d.get(i);
                Object[] objArr9 = {addressItem2};
                ChangeQuickRedirect changeQuickRedirect9 = c.a;
                if (PatchProxy.isSupport(objArr9, cVar, changeQuickRedirect9, false, "12151276a4f09be25ccf12bd87791254", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, cVar, changeQuickRedirect9, false, "12151276a4f09be25ccf12bd87791254");
                } else {
                    cVar.b.setText(addressItem2.addrBrief);
                }
                AddressItem addressItem3 = this.d.get(i);
                Object[] objArr10 = {addressItem3, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "f9bbaaf2b091687f52d5650e515576f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "f9bbaaf2b091687f52d5650e515576f9");
                } else {
                    com.sankuai.waimai.addrsdk.base.a b2 = com.sankuai.waimai.addrsdk.manager.a.a().b();
                    if (b2 != null && b2.a() != null) {
                        str = b2.a() + "+" + System.currentTimeMillis();
                    } else {
                        str = "+" + System.currentTimeMillis();
                    }
                    Context context2 = this.n;
                    Object[] objArr11 = {context2, addressItem3, str};
                    ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.business.address.util.d.a;
                    if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "08b99f363d3da765a7cf436fd2795dc8", RobustBitConfig.DEFAULT_VALUE)) {
                        map = (Map) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "08b99f363d3da765a7cf436fd2795dc8");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("address_longitude", String.valueOf(addressItem3.lng / 1000000.0d));
                        hashMap.put("address_latitude", String.valueOf(addressItem3.lat / 1000000.0d));
                        hashMap.put("address_name", addressItem3.addrBrief);
                        hashMap.put("address_address", addressItem3.addrDesc);
                        hashMap.put("address_type", addressItem3.type);
                        hashMap.put("search_type", "附近搜索");
                        hashMap.put("radius", Integer.valueOf(com.sankuai.waimai.platform.domain.manager.location.search.b.a(context2.getApplicationContext())));
                        hashMap.put("city", addressItem3.cityName);
                        hashMap.put("address_services", com.sankuai.waimai.business.address.util.d.a(context2));
                        hashMap.put("address_id", addressItem3.mapSearchPoiId);
                        hashMap.put("source", addressItem3.source);
                        hashMap.put("req_trace_id", str);
                        map = hashMap;
                    }
                    d dVar = this.p;
                    String str5 = addressItem3.lat + CommonConstant.Symbol.UNDERLINE + addressItem3.lng + CommonConstant.Symbol.UNDERLINE + i;
                    int a3 = i - a();
                    Object[] objArr12 = {"b_noVkn", str5, map, Integer.valueOf(a3)};
                    ChangeQuickRedirect changeQuickRedirect12 = d.a;
                    if (PatchProxy.isSupport(objArr12, dVar, changeQuickRedirect12, false, "d1115775de9f3d2eb63aa8f24f2f843a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, dVar, changeQuickRedirect12, false, "d1115775de9f3d2eb63aa8f24f2f843a");
                    } else if (!dVar.a("b_noVkn", str5)) {
                        dVar.a("b_noVkn");
                        dVar.b("b_noVkn", str5);
                        JudasManualManager.b("b_noVkn").a("index", a3).b(map).a();
                    }
                }
                return view3;
            default:
                return view;
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a6b62c5119e25e6905718150abb5fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a6b62c5119e25e6905718150abb5fd")).intValue();
        }
        if (this.l || this.f.size() <= 1) {
            return 0;
        }
        if (this.b.size() > 5) {
            return this.f.get(0).intValue() + 1;
        }
        return this.f.get(0).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.address.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0724a {
        public RooIconFont a;
        public TextView b;

        public C0724a(View view) {
            this.a = (RooIconFont) view.findViewById(R.id.img_address_namually_list_header);
            this.b = (TextView) view.findViewById(R.id.txt_address_manually_list_header);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b {
        public static ChangeQuickRedirect a;
        final com.sankuai.waimai.business.address.controller.a b;

        public b(View view) {
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ccebfb33721fdfaa68d9e4f78b97edc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ccebfb33721fdfaa68d9e4f78b97edc");
            } else {
                this.b = new com.sankuai.waimai.business.address.controller.a(view, 1);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class c {
        public static ChangeQuickRedirect a;
        public TextView b;

        public c(View view) {
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c14408671a62f83febb28dd4a87a76", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c14408671a62f83febb28dd4a87a76");
            } else {
                this.b = (TextView) view.findViewById(R.id.txt_nealy_location);
            }
        }
    }
}
