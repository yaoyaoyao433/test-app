package com.sankuai.waimai.store.im.poi;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.video.model.VideoPreviewParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMSGIMCommonAdapter extends IMCommonAdapterWrapper {
    public static ChangeQuickRedirect b;
    String c;
    private com.sankuai.waimai.store.im.a d;
    private Map<Integer, String> g;

    public WMSGIMCommonAdapter(ICommonAdapter iCommonAdapter) {
        super(iCommonAdapter);
        Object[] objArr = {iCommonAdapter};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f4e26f9da6fabf8f96d936796760e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f4e26f9da6fabf8f96d936796760e2");
            return;
        }
        this.c = "";
        this.g = new LinkedHashMap();
        this.d = new com.sankuai.waimai.store.im.a();
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getDefaultAvatarDrawableResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dcec68f7558964e2cf3192306d0fcfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dcec68f7558964e2cf3192306d0fcfb")).intValue();
        }
        if (this.d != null) {
            return this.d.a(bVar);
        }
        return 0;
    }

    private static int a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0bd8aa5b2a4516aaebf7bb649ab350e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0bd8aa5b2a4516aaebf7bb649ab350e")).intValue();
        }
        if (generalMessage.getData() != null) {
            try {
                byte[] data = generalMessage.getData();
                if (data != null) {
                    return new JSONObject(new String(data, "utf-8")).optInt("type");
                }
                return 3;
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
                return 3;
            }
        }
        return 3;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getLinkColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240808ff5f4fdafef689da1a1898793f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240808ff5f4fdafef689da1a1898793f")).intValue() : Color.parseColor("#035DE3");
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonClickAdapter
    public boolean onLongClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2601a5484d47463033297420f55b284", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2601a5484d47463033297420f55b284")).booleanValue();
        }
        if (com.meituan.android.ptcommonim.base.manager.b.a().c()) {
            b(view, bVar);
            return true;
        }
        return super.onLongClick(view, bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter
    public final Map<Integer, String> a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d3e14572040b628b60dac7bb9780462", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d3e14572040b628b60dac7bb9780462");
        }
        if (!com.meituan.android.ptcommonim.base.manager.b.a().c()) {
            return super.a(bVar);
        }
        if (this.e != null) {
            this.g.clear();
            if (bVar.b instanceof TextMessage) {
                this.g.put(2, com.sankuai.waimai.store.util.b.a(this.e, (int) R.string.xm_sdk_msg_menu_copy));
            }
            if (new com.meituan.android.ptcommonim.message.recall.manager.a(this.e, new PTIMCommonBean("1702", this.c, d.a, "", PTIMCommonBean.UserType.TYPE_C), bVar.b).b()) {
                this.g.put(7, com.sankuai.waimai.store.util.b.a(this.e, (int) R.string.xm_sdk_msg_menu_cancel));
            } else {
                this.g.remove(7);
            }
        }
        return this.g;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter
    public final boolean a(DialogInterface dialogInterface, int i, IMMessage iMMessage) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i), iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6f6634e49120d0443de798a50da75c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6f6634e49120d0443de798a50da75c")).booleanValue();
        }
        if (com.meituan.android.ptcommonim.base.manager.b.a().c()) {
            if (i == 7) {
                new com.meituan.android.ptcommonim.message.recall.manager.a(this.e, new PTIMCommonBean("1702", this.c, d.a, "", PTIMCommonBean.UserType.TYPE_C), iMMessage).a();
                return true;
            }
            return super.a(dialogInterface, i, iMMessage);
        }
        return super.a(dialogInterface, i, iMMessage);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean onTextLinkClick(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0edc7e4d29e62ecb74fe599a72e38877", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0edc7e4d29e62ecb74fe599a72e38877")).booleanValue();
        }
        if (com.meituan.android.ptcommonim.base.manager.b.a().c()) {
            if (com.meituan.android.ptcommonim.message.recall.manager.a.a(view, str)) {
                return true;
            }
            return super.onTextLinkClick(view, str);
        }
        return super.onTextLinkClick(view, str);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getAvatarVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7afec7c79e73f7e52acb83d48a6c12fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7afec7c79e73f7e52acb83d48a6c12fc")).intValue();
        }
        M m = bVar.b;
        if (m instanceof GeneralMessage) {
            GeneralMessage generalMessage = (GeneralMessage) m;
            int a = a(generalMessage);
            if (generalMessage.getData() != null && (a == 6 || a == 7 || a == 103 || a == 105)) {
                return 8;
            }
        }
        return super.getAvatarVisibility(bVar);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getBackgroundResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2193e423d5acb7244f7b65539a3eccd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2193e423d5acb7244f7b65539a3eccd")).intValue();
        }
        if (bVar.g == 2) {
            if ((bVar.b != 0 && (bVar.b instanceof TextMessage)) || (bVar.b instanceof AudioMessage)) {
                return R.drawable.wm_im_sc_normal_corner_bg;
            }
            if (bVar.b instanceof GeneralMessage) {
                return 0;
            }
        }
        return super.getBackgroundResource(bVar);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getStyle(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b67b100f7243df684095632b91f738e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b67b100f7243df684095632b91f738e")).intValue();
        }
        M m = bVar.b;
        if (m instanceof GeneralMessage) {
            GeneralMessage generalMessage = (GeneralMessage) m;
            int a = a(generalMessage);
            if (generalMessage.getData() != null) {
                if (a == 103 || a == 105) {
                    return 3;
                }
                switch (a) {
                    case 6:
                    case 7:
                        return 3;
                }
            }
        }
        return super.getStyle(bVar);
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonClickAdapter
    public boolean onClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86ab988efe1e0d9967755b6e76e4d2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86ab988efe1e0d9967755b6e76e4d2e")).booleanValue();
        }
        try {
            if (bVar.b instanceof VideoMessage) {
                VideoMessage videoMessage = (VideoMessage) bVar.b;
                com.meituan.android.ptcommonim.video.a.a(this.e, new VideoPreviewParam(0, com.sankuai.xm.imui.session.b.b(this.e).b.a(), videoMessage.getUrl(), videoMessage.getScreenshotUrl(), videoMessage.getDuration()), new PTIMCommonBean("1702", this.c, d.a, "", PTIMCommonBean.UserType.TYPE_C));
                return true;
            }
            return super.onClick(view, bVar);
        } catch (Exception unused) {
            return super.onClick(view, bVar);
        }
    }
}
