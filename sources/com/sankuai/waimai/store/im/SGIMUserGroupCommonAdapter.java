package com.sankuai.waimai.store.im;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.video.model.VideoPreviewParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.im.group.model.GroupAdministrator;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMUserGroupCommonAdapter extends CommonAdapter {
    public static ChangeQuickRedirect a;
    public String b;
    private final UserGroupImInfo c;
    private Map<Integer, String> d;
    private a g;

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean hasLinkTextUnderLine(com.sankuai.xm.imui.session.entity.b bVar) {
        return false;
    }

    public SGIMUserGroupCommonAdapter(UserGroupImInfo userGroupImInfo) {
        Object[] objArr = {userGroupImInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "136d6f364b8d39f68aa42cbc1952546c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "136d6f364b8d39f68aa42cbc1952546c");
            return;
        }
        this.d = new LinkedHashMap();
        this.b = "";
        if (userGroupImInfo != null) {
            this.c = userGroupImInfo;
        } else {
            this.c = new UserGroupImInfo();
        }
        this.g = new a();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getDefaultAvatarDrawableResource(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9742ab611ce5b7b3803fa43b220d1af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9742ab611ce5b7b3803fa43b220d1af")).intValue();
        }
        if (this.g != null) {
            return this.g.a(bVar);
        }
        return 0;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean onTextLinkClick(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d6002a3e0f923f37e86004e09abaf7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d6002a3e0f923f37e86004e09abaf7")).booleanValue();
        }
        if (!com.meituan.android.ptcommonim.base.manager.b.a().c() || com.meituan.android.ptcommonim.message.recall.manager.a.a(view, str)) {
            return true;
        }
        return super.onTextLinkClick(view, str);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getStyle(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8fba8160374e72cec71d3943ec0c0c9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8fba8160374e72cec71d3943ec0c0c9")).intValue() : super.getStyle(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public void onAvatarClick(View view, com.sankuai.xm.imui.session.entity.b bVar) {
        boolean z;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db8fc2e85945910f8715ce073ea22b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db8fc2e85945910f8715ce073ea22b6");
            return;
        }
        super.onAvatarClick(view, bVar);
        UserGroupImInfo userGroupImInfo = this.c;
        long fromUid = bVar.b.getFromUid();
        Object[] objArr2 = {userGroupImInfo, new Long(fromUid)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b0791e0f36398c93ed5a1d63d3cbc38", RobustBitConfig.DEFAULT_VALUE)) {
            List<GroupAdministrator> list = userGroupImInfo.administrators;
            int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
            int i = 0;
            while (true) {
                if (i < a2) {
                    GroupAdministrator groupAdministrator = list.get(i);
                    if (groupAdministrator != null && groupAdministrator.uid == fromUid) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b0791e0f36398c93ed5a1d63d3cbc38")).booleanValue();
        }
        com.sankuai.waimai.store.manager.judas.b.a("c_waimai_4pe066t1", "b_waimai_m40j21qt_mc").a("poi_id", this.c.poiId).a("group_id", this.c.groupId).a("type", Integer.valueOf(z ? 1 : 0)).a();
        if (z) {
            com.sankuai.waimai.store.router.d.a(view.getContext(), this.c.singleChatSchemeUrl);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonClickAdapter
    public boolean onLongClick(final View view, final com.sankuai.xm.imui.session.entity.b bVar) {
        int a2;
        boolean z = false;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a870a732fc542ebc31c53520f2e6ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a870a732fc542ebc31c53520f2e6ee")).booleanValue();
        }
        final String a3 = com.sankuai.waimai.store.util.b.a(view.getContext(), (int) R.string.wm_sc_im_group_copy);
        final String a4 = com.sankuai.waimai.store.util.b.a(view.getContext(), (int) R.string.wm_sc_im_group_report);
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29d991e193e09041cf16baef38a7fc42", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29d991e193e09041cf16baef38a7fc42")).booleanValue();
        } else if (this.c.groupReportMsgSwitch != 0 && bVar != null && bVar.g != 2 && ((a2 = MsgViewType.a(bVar.b)) == 3 || a2 == 0 || a2 == 2)) {
            z = true;
        }
        if (!z) {
            b(view, bVar);
            return true;
        } else if (bVar == null || bVar.b == 0) {
            return true;
        } else {
            final ArrayList arrayList = new ArrayList();
            if (bVar.b instanceof TextMessage) {
                arrayList.add(a3);
            }
            arrayList.add(a4);
            new AlertDialog.Builder(view.getContext()).setItems((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.im.SGIMUserGroupCommonAdapter.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2d0eea7fef6012036dfaa2d1e87a122", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2d0eea7fef6012036dfaa2d1e87a122");
                        return;
                    }
                    String str = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i);
                    if (TextUtils.equals(str, a3)) {
                        k.a(view.getContext(), ((TextMessage) bVar.b).getText());
                    } else if (!TextUtils.equals(str, a4) || t.a(SGIMUserGroupCommonAdapter.this.c.groupReportSchemeUrl)) {
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("msgUuid", String.valueOf(bVar.b.getMsgUuid()));
                        com.sankuai.waimai.store.router.d.a(view.getContext(), SGIMUserGroupCommonAdapter.this.c.groupReportSchemeUrl, bundle);
                    }
                }
            }).setCancelable(true).show();
            return true;
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter
    public final void a(View view, com.sankuai.xm.imui.session.entity.b bVar, Map<Integer, String> map) {
        Object[] objArr = {view, bVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052406c2eb4acb8139ccf966158e98ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052406c2eb4acb8139ccf966158e98ad");
        } else {
            super.a(view, bVar, map);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter
    public final Map<Integer, String> a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a51e4999e792accd221c76533af869b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a51e4999e792accd221c76533af869b");
        }
        if (!com.meituan.android.ptcommonim.base.manager.b.a().c()) {
            if (this.d.isEmpty() && this.e != null) {
                this.d.put(2, com.sankuai.waimai.store.util.b.a(this.e, (int) R.string.xm_sdk_msg_menu_copy));
            }
            return this.d;
        }
        if (this.e != null) {
            this.d.clear();
            if (bVar.b instanceof TextMessage) {
                this.d.put(2, com.sankuai.waimai.store.util.b.a(this.e, (int) R.string.xm_sdk_msg_menu_copy));
            }
            if (new com.meituan.android.ptcommonim.message.recall.manager.a(this.e, new PTIMCommonBean("1702", this.b, com.sankuai.waimai.business.im.utils.d.a, "", PTIMCommonBean.UserType.TYPE_C), bVar.b).b()) {
                this.d.put(7, com.sankuai.waimai.store.util.b.a(this.e, (int) R.string.xm_sdk_msg_menu_cancel));
            } else {
                this.d.remove(7);
            }
        }
        return this.d;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter
    public final boolean a(DialogInterface dialogInterface, int i, IMMessage iMMessage) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i), iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d8ff90d47527133a3f4fda92a91a1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d8ff90d47527133a3f4fda92a91a1a")).booleanValue();
        }
        if (com.meituan.android.ptcommonim.base.manager.b.a().c()) {
            if (i == 7) {
                new com.meituan.android.ptcommonim.message.recall.manager.a(this.e, new PTIMCommonBean("1702", this.b, com.sankuai.waimai.business.im.utils.d.a, "", PTIMCommonBean.UserType.TYPE_C), iMMessage).a();
                return true;
            }
            return super.a(dialogInterface, i, iMMessage);
        }
        return super.a(dialogInterface, i, iMMessage);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getLinkColor(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95134a0d6fac57a5d3cf48f72a29a862", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95134a0d6fac57a5d3cf48f72a29a862")).intValue() : Color.parseColor("#035DE3");
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public int getBackgroundResource(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "714b2016c7aeebe632c125910f9c5884", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "714b2016c7aeebe632c125910f9c5884")).intValue();
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

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf76c4ded85b3af51b1480631ab405a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf76c4ded85b3af51b1480631ab405a")).intValue() : bVar.b instanceof EventMessage ? 8 : 0;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonClickAdapter
    public boolean onClick(View view, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cafb518c98daf3ec2add4fef5e897a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cafb518c98daf3ec2add4fef5e897a9")).booleanValue();
        }
        try {
            if (bVar.b instanceof VideoMessage) {
                VideoMessage videoMessage = (VideoMessage) bVar.b;
                com.meituan.android.ptcommonim.video.a.a(this.e, new VideoPreviewParam(0, com.sankuai.xm.imui.session.b.b(this.e).b.a(), videoMessage.getUrl(), videoMessage.getScreenshotUrl(), videoMessage.getDuration()), new PTIMCommonBean("1702", this.b, com.sankuai.waimai.business.im.utils.d.a, "", PTIMCommonBean.UserType.TYPE_C));
                return true;
            }
            return super.onClick(view, bVar);
        } catch (Exception unused) {
            return super.onClick(view, bVar);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getTextColor(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47167ea6294bf18eaeb8d978c24fd252", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47167ea6294bf18eaeb8d978c24fd252")).intValue();
        }
        int a2 = MsgViewType.a(bVar.b);
        if (a2 == 0) {
            return com.sankuai.waimai.store.util.b.b(this.e, R.color.wm_st_common_text_title);
        }
        if (11 == a2) {
            return com.sankuai.waimai.store.util.b.b(this.e, R.color.wm_sc_mine_tab_background);
        }
        return super.getTextColor(bVar);
    }
}
