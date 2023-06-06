package com.sankuai.waimai.store.im.poi.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.im.base.mach.IMJSEventHandler;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.im.poi.block.b;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMMachNormalBlock extends b implements com.sankuai.waimai.store.im.delegate.a {
    public static ChangeQuickRedirect j;
    public com.sankuai.xm.imui.session.entity.b<GeneralMessage> k;

    @Override // com.sankuai.waimai.store.im.delegate.a
    public final void a() {
    }

    @Override // com.sankuai.waimai.store.im.delegate.a
    public final void b() {
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1df1e762d75a52053b5fa4e158b469f2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1df1e762d75a52053b5fa4e158b469f2") : super.onCreateView(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.store.im.poi.block.b, com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ceae256991401c2acfe5099f71df9e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ceae256991401c2acfe5099f71df9e4");
            return;
        }
        super.onViewCreated();
        com.meituan.android.bus.a.a().a(this);
    }

    public SGIMMachNormalBlock(@NonNull Context context, String str, com.sankuai.waimai.store.expose.v2.a aVar, com.sankuai.waimai.store.im.poi.contract.a aVar2) {
        super(context, str, aVar, aVar2);
        Object[] objArr = {context, str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d225d476d87ccd325e52bd03f9e3a64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d225d476d87ccd325e52bd03f9e3a64");
        }
    }

    public final void a(b.a aVar) {
        this.b = aVar;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c7e391d277c4f6055baa2c423ae2c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c7e391d277c4f6055baa2c423ae2c7");
        } else if (getView() == null || getView().getLayoutParams() == null) {
        } else {
            getView().getLayoutParams().height = i2;
            getView().getLayoutParams().width = i;
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.block.b
    public final Map<String, com.sankuai.waimai.store.mach.event.b> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bdf4e8aea5af06703d0a3f3c80bb312", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bdf4e8aea5af06703d0a3f3c80bb312");
        }
        HashMap hashMap = new HashMap();
        IMJSEventHandler iMJSEventHandler = new IMJSEventHandler(this.f);
        iMJSEventHandler.d = this.k;
        iMJSEventHandler.e = getView();
        iMJSEventHandler.b = new IMJSEventHandler.b() { // from class: com.sankuai.waimai.store.im.poi.block.SGIMMachNormalBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.base.mach.IMJSEventHandler.b
            public final void a(Map<String, Object> map, com.sankuai.waimai.store.mach.event.a aVar) {
                Object[] objArr2 = {map, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4daa6992e1c6632059195d7efdb6eb50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4daa6992e1c6632059195d7efdb6eb50");
                } else if (SGIMMachNormalBlock.this.b != null) {
                    SGIMMachNormalBlock.this.b.a(map, aVar);
                }
            }

            @Override // com.sankuai.waimai.store.im.base.mach.IMJSEventHandler.b
            public final void a(Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "245a77a7996bf12849b007a6328fde01", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "245a77a7996bf12849b007a6328fde01");
                } else if (SGIMMachNormalBlock.this.b != null) {
                    SGIMMachNormalBlock.this.b.a(map);
                }
            }
        };
        hashMap.put("jump", iMJSEventHandler);
        hashMap.put("mach_im_normal_data", iMJSEventHandler);
        hashMap.put("mach_im_normal_send_msg", iMJSEventHandler);
        hashMap.put("mach_im_delete_normal_msg_data", iMJSEventHandler);
        hashMap.put("mach_im_normal_send_tip_msg", iMJSEventHandler);
        hashMap.put("foods_detail_click_foods_item", iMJSEventHandler);
        hashMap.put("jump_preview_image_page", iMJSEventHandler);
        hashMap.put("jump_preview_video_page", iMJSEventHandler);
        hashMap.put("mach_im_withdraw", iMJSEventHandler);
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.im.poi.block.b
    public final Map<String, Object> a(BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, 0};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74ff5b4988b3bed348e23ac60529e3f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74ff5b4988b3bed348e23ac60529e3f3");
        }
        HashMap hashMap = new HashMap();
        if (this.k != null && this.k.b != null) {
            hashMap.put("msg_id", Long.valueOf(this.k.b.getMsgId()));
            hashMap.put("msg_uuid", this.k.b.getMsgUuid());
            hashMap.put("msg_sts", Long.valueOf(this.k.b.getSts()));
        }
        if (this.f != null) {
            hashMap.put("poi_id", t.a(this.f.r()) ? "-999" : this.f.r());
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, t.a(this.f.s()) ? "-999" : this.f.s());
            hashMap.put("order_view_id", t.a(this.f.C()) ? "-999" : this.f.C());
            UserGroupImInfo bu_ = this.f.bu_();
            if (bu_ != null) {
                hashMap.put("group_id", t.a(bu_.groupId) ? "-999" : bu_.groupId);
                hashMap.put("conversation", 2);
                hashMap.put("poi_scheme_url", t.a(bu_.poiSchemeUrl) ? "" : bu_.poiSchemeUrl);
                hashMap.put(AgainManager.EXTRA_POI_NAME, t.a(bu_.poiName) ? "" : bu_.poiName);
                hashMap.put("poi_picture_url", t.a(bu_.poiPictureUrl) ? "" : bu_.poiPictureUrl);
            } else {
                hashMap.put("conversation", 1);
            }
        }
        hashMap.put("im_max_content_width", Integer.valueOf(com.sankuai.waimai.store.im.util.b.a(this.mContext)));
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.im.delegate.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eccbb06ec2b25a0cf0b866de1e937ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eccbb06ec2b25a0cf0b866de1e937ab");
        } else {
            com.meituan.android.bus.a.a().b(this);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f04dcf703a6fb53b1c3c2ef7ee536a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f04dcf703a6fb53b1c3c2ef7ee536a4");
        } else {
            super.onDestroy();
        }
    }

    @Subscribe
    public void onMachNormalEvent(com.sankuai.waimai.store.im.base.mach.b bVar) {
        boolean z = true;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31062888b1de115b545c62bdf1d47397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31062888b1de115b545c62bdf1d47397");
        } else if (bVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.base.mach.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "94fa048810191566a99dd1d3f7be4cc3", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "94fa048810191566a99dd1d3f7be4cc3")).booleanValue();
            } else if (!t.a(bVar.b) && !t.a(bVar.c) && bVar.d != null && !bVar.d.isEmpty()) {
                z = false;
            }
            if (z || this.c == null || !TextUtils.equals(this.c.o, bVar.c)) {
                return;
            }
            this.c.b(bVar.b, bVar.d);
        }
    }
}
