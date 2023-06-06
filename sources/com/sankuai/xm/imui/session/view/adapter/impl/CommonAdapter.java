package com.sankuai.xm.imui.session.view.adapter.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.g;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.c;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.event.e;
import com.sankuai.xm.imui.session.view.SafeDialog;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter;
import com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter;
import com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter;
import com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter;
import com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter;
import com.sankuai.xm.imui.session.view.menu.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommonAdapter extends BaseMsgAdapter implements ICommonAdapter {
    public static ChangeQuickRedirect f;
    private ICommonUserInfoAdapter a;
    private ICommonStyleAdapter b;
    private ICommonTextAdapter c;
    private ICommonStatusAdapter d;
    private ICommonSideAdapter g;

    public boolean onClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5e1435ed2377f806c3f9f08a395501", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5e1435ed2377f806c3f9f08a395501")).booleanValue();
        }
        return false;
    }

    public CommonAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37138e3fdd638bc695ad4b629152d152", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37138e3fdd638bc695ad4b629152d152");
            return;
        }
        this.a = new CommonUserInfoAdapter();
        this.b = new CommonStyleAdapter();
        this.c = new CommonTextAdapter();
        this.d = new CommonStatusAdapter();
        this.g = new CommonSideAdapter();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69339eec50ea96ad263a8093f0d0a739", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69339eec50ea96ad263a8093f0d0a739");
            return;
        }
        super.init(context);
        this.a.init(context);
        this.b.init(context);
        this.c.init(context);
        this.d.init(context);
        this.g.init(context);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4742d60fb071ec1edcfd3f8d588c4b9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4742d60fb071ec1edcfd3f8d588c4b9b");
            return;
        }
        this.a.release();
        this.b.release();
        this.c.release();
        this.d.release();
        this.g.release();
        super.release();
    }

    public int getStyle(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ebb21a729f827c993e115b935920fe", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ebb21a729f827c993e115b935920fe")).intValue() : this.b.getStyle(bVar);
    }

    public boolean onLongClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f29046bc7c423f262ded6772bfa4148", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f29046bc7c423f262ded6772bfa4148")).booleanValue();
        }
        b(view, bVar);
        return true;
    }

    public final void b(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e0fe4278dbb53276804e70faa766f0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e0fe4278dbb53276804e70faa766f0d");
        } else {
            a(view, bVar, a(bVar));
        }
    }

    public int getNickNameVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ab5ace3b48637ea9cb9c4a0e181f20", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ab5ace3b48637ea9cb9c4a0e181f20")).intValue() : this.a.getNickNameVisibility(bVar);
    }

    public int getDefaultAvatarDrawableResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f6e6f1f6b443ad85dbee88ecc7b74c3", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f6e6f1f6b443ad85dbee88ecc7b74c3")).intValue() : this.a.getDefaultAvatarDrawableResource(bVar);
    }

    public int getAvatarSize(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a81d1c64c43f70e3297fbf6b4af1cbbc", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a81d1c64c43f70e3297fbf6b4af1cbbc")).intValue() : this.a.getAvatarSize(bVar);
    }

    public int getAvatarCornerRadius(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b069e38cdd70cb336a89393b64d3d3", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b069e38cdd70cb336a89393b64d3d3")).intValue() : this.a.getAvatarCornerRadius(bVar);
    }

    public int getAvatarVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077db85d6de3580517602d384b8236d7", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077db85d6de3580517602d384b8236d7")).intValue() : this.a.getAvatarVisibility(bVar);
    }

    public void onAvatarClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941b823452e6f1a424929a9c4cf8512a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941b823452e6f1a424929a9c4cf8512a");
        } else {
            this.a.onAvatarClick(view, bVar);
        }
    }

    public boolean onAvatarLongClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83950525106372e8f45e03e5be288d18", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83950525106372e8f45e03e5be288d18")).booleanValue() : this.a.onAvatarLongClick(view, bVar);
    }

    public int getBackgroundResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0538370e98afbc15ea2a07d38424e34b", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0538370e98afbc15ea2a07d38424e34b")).intValue() : this.b.getBackgroundResource(bVar);
    }

    public int[] getPadding(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfad799952fcf67d9de1752ce084ff13", 6917529027641081856L) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfad799952fcf67d9de1752ce084ff13") : this.b.getPadding(bVar);
    }

    public int getTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22defc0f901c921530687068febfd465", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22defc0f901c921530687068febfd465")).intValue() : this.c.getTextColor(bVar);
    }

    public int getLinkColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da023e0e1a70a180a3d14ba1f44d0e5b", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da023e0e1a70a180a3d14ba1f44d0e5b")).intValue() : this.c.getLinkColor(bVar);
    }

    public int getTextFontSize(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b932b932f76aba6615dd235bc13bb150", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b932b932f76aba6615dd235bc13bb150")).intValue() : this.c.getTextFontSize(bVar);
    }

    public int getLineSpacingExtra(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c86cfd0a74265ceff57bc1a3c6da36", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c86cfd0a74265ceff57bc1a3c6da36")).intValue() : this.c.getLineSpacingExtra(bVar);
    }

    public boolean hasLinkTextUnderLine(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be0f06505dacefaf8bf313211c03cd7a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be0f06505dacefaf8bf313211c03cd7a")).booleanValue() : this.c.hasLinkTextUnderLine(bVar);
    }

    public boolean onTextLinkClick(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4024e16d6f42e5589a286fd80cfc63d", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4024e16d6f42e5589a286fd80cfc63d")).booleanValue() : this.c.onTextLinkClick(view, str);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public Set<String> getTextLinkSchema() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87fc5c736f587e3df16faf056b11a731", 6917529027641081856L) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87fc5c736f587e3df16faf056b11a731") : this.c.getTextLinkSchema();
    }

    public int getTimeStampVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83d1f8a55bb4797a59df7c4bc2843269", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83d1f8a55bb4797a59df7c4bc2843269")).intValue() : this.d.getTimeStampVisibility(bVar);
    }

    public int getMsgStatusVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176277d5677ee07834bb776a77b5105a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176277d5677ee07834bb776a77b5105a")).intValue() : this.d.getMsgStatusVisibility(bVar);
    }

    public int getStatusGravity(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ae3af3a9c4d57ff483923bd74ad9a7", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ae3af3a9c4d57ff483923bd74ad9a7")).intValue() : this.d.getStatusGravity(bVar);
    }

    public int getProgressBarResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199f5690e558c762074a87d90de61d56", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199f5690e558c762074a87d90de61d56")).intValue() : this.d.getProgressBarResource(bVar);
    }

    public String getTimeStamp(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800d1488c5513011a9a5db89ae6f4116", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800d1488c5513011a9a5db89ae6f4116") : this.d.getTimeStamp(bVar);
    }

    public int getMsgStatusTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6911f1d19d23d6175bf72c169bc229a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6911f1d19d23d6175bf72c169bc229a")).intValue() : this.d.getMsgStatusTextColor(bVar);
    }

    public void onMsgStatusClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13aa7c610aab22b572c7043a94fea489", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13aa7c610aab22b572c7043a94fea489");
        } else {
            this.d.onMsgStatusClick(view, bVar);
        }
    }

    public void onMsgFailTipClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5806f2fdfe39310b607d7c01a2d86aa2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5806f2fdfe39310b607d7c01a2d86aa2");
        } else {
            this.d.onMsgFailTipClick(view, bVar);
        }
    }

    public int getTopSideLayout(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d368f9e6c379c5221b653f275a679e69", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d368f9e6c379c5221b653f275a679e69")).intValue() : this.g.getTopSideLayout(context, bVar);
    }

    public int getBottomSideLayout(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9d67892ab8e86fd5e232f4e4b33bfb", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9d67892ab8e86fd5e232f4e4b33bfb")).intValue() : this.g.getBottomSideLayout(context, bVar);
    }

    public int getInnerSideLayout(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acce85917263f4dc2b1f6e24e1fb9210", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acce85917263f4dc2b1f6e24e1fb9210")).intValue() : this.g.getInnerSideLayout(context, bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
    public int getOuterSideLayout(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae86415fa713068b7b793db539f814d3", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae86415fa713068b7b793db539f814d3")).intValue() : this.g.getTopSideLayout(context, bVar);
    }

    public Map<Integer, String> a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2c461b16a49ceb8995f5d4683da95f", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2c461b16a49ceb8995f5d4683da95f");
        }
        Context context = this.e;
        Object[] objArr2 = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f1e028eed329327ae42d35e6548b6355", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f1e028eed329327ae42d35e6548b6355");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bVar.b.getMsgType() == 1 && context != null) {
            linkedHashMap.put(2, context.getString(R.string.xm_sdk_msg_menu_copy));
        }
        if (a.c(context, bVar.b)) {
            linkedHashMap.put(3, context.getString(R.string.xm_sdk_msg_menu_forward));
        }
        if (a.d(context, bVar.b)) {
            linkedHashMap.put(13, context.getString(R.string.xm_sdk_msg_menu_multi_select));
        }
        if (a.a(context, bVar.b)) {
            linkedHashMap.put(12, context.getString(R.string.xm_sdk_msg_menu_admin_cancel));
        }
        return linkedHashMap;
    }

    public void a(final View view, b bVar, final Map<Integer, String> map) {
        Object[] objArr = {view, bVar, map};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf810ce9ef5fc47697b14dea41f2bd9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf810ce9ef5fc47697b14dea41f2bd9f");
            return;
        }
        final M m = bVar.b;
        final a.InterfaceC1403a interfaceC1403a = new a.InterfaceC1403a() { // from class: com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.session.view.menu.a.InterfaceC1403a
            public final boolean a(DialogInterface dialogInterface, int i, IMMessage iMMessage) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i), iMMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ca5362ac0048d1303da1cb9047c2671", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ca5362ac0048d1303da1cb9047c2671")).booleanValue() : CommonAdapter.this.a(dialogInterface, i, iMMessage);
            }
        };
        Object[] objArr2 = {view, m, map, interfaceC1403a};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e1761c010f0bd8fa44926cc4b1a3c73e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e1761c010f0bd8fa44926cc4b1a3c73e");
        } else if (view != null && m != 0 && m.getMsgStatus() != 3) {
            int msgType = m.getMsgType();
            if (msgType == 12 || msgType == -100) {
                d.c("MenuUtils::showMsgLongClickMenu: msg [" + m.keyParamToString() + "] not support long click menu", new Object[0]);
                return;
            }
            d.b("MenuUtils::showMsgLongClickMenu: menus", map);
            final com.sankuai.xm.imui.session.b b = com.sankuai.xm.imui.session.b.b(view.getContext());
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (map == null || map.size() <= 0) {
                return;
            }
            for (Integer num : map.keySet()) {
                if ((num.intValue() != 7 || a.b(view.getContext(), m)) && ((num.intValue() != 12 || a.a(view.getContext(), m)) && (num.intValue() != 13 || a.d(view.getContext(), m)))) {
                    if (num.intValue() != 3 || a.c(view.getContext(), m)) {
                        arrayList.add(num);
                        arrayList2.add(map.get(num));
                    }
                }
                d.c("MenuUtils::showMsgLongClickMenu: not support for ", map.get(num));
            }
            if (arrayList2.size() <= 0) {
                d.c("MenuUtils::showMsgLongClickMenu: menuNames is empty", new Object[0]);
                return;
            }
            try {
                new SafeDialog.a(view.getContext()).a((CharSequence[]) arrayList2.toArray(new String[arrayList2.size()]), new DialogInterface.OnClickListener() { // from class: com.sankuai.xm.imui.session.view.menu.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(final DialogInterface dialogInterface, final int i) {
                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2c5ef5720cce552a055598089bfebd9", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2c5ef5720cce552a055598089bfebd9");
                        } else {
                            IMClient.a().a(m.getCategory(), m.getMsgUuid(), new com.sankuai.xm.im.d<IMMessage>() { // from class: com.sankuai.xm.imui.session.view.menu.a.1.1
                                public static ChangeQuickRedirect a;

                                {
                                    AnonymousClass1.this = this;
                                }

                                @Override // com.sankuai.xm.im.d
                                public final /* synthetic */ void b_(IMMessage iMMessage) {
                                    Object[] objArr4 = {iMMessage};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7886d320e0ba47dbdc5ebcebd21d8631", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7886d320e0ba47dbdc5ebcebd21d8631");
                                        return;
                                    }
                                    int intValue = ((Integer) arrayList.get(i)).intValue();
                                    if (intValue == 12 || interfaceC1403a == null || !interfaceC1403a.a(dialogInterface, intValue, m)) {
                                        d.b("MenuUtils::showMsgLongClickMenu: menu [%s] is clicked", map.get(Integer.valueOf(intValue)));
                                        if (intValue == 7) {
                                            if (IMUIManager.a().b(m) != 0) {
                                                ad.a(view.getContext(), (int) R.string.xm_sdk_session_msg_cancel_fail);
                                                return;
                                            }
                                            return;
                                        }
                                        switch (intValue) {
                                            case 2:
                                                if (m instanceof TextMessage) {
                                                    k.a(view.getContext(), ((TextMessage) m).getText());
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                if (b.e()) {
                                                    return;
                                                }
                                                c.a(MessageUtils.getCopyMsg(m));
                                                b.a(e.C1400e.a(com.sankuai.xm.base.util.b.a(m)));
                                                return;
                                            case 4:
                                                IMUIManager.a().a(m);
                                                return;
                                            default:
                                                switch (intValue) {
                                                    case 12:
                                                        m.setAdminUid(IMUIManager.a().e());
                                                        g.a((Dialog) dialogInterface);
                                                        final View view2 = view;
                                                        final IMMessage iMMessage2 = m;
                                                        final InterfaceC1403a interfaceC1403a2 = interfaceC1403a;
                                                        Object[] objArr5 = {view2, iMMessage2, interfaceC1403a2};
                                                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "31976052ada6afd52de9f0feebfed898", 6917529027641081856L)) {
                                                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "31976052ada6afd52de9f0feebfed898");
                                                            return;
                                                        } else {
                                                            new SafeDialog.a(view2.getContext()).b(R.string.xm_sdk_session_msg_admin_cancel_alert_info).a(R.string.xm_sdk_msg_menu_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.xm.imui.session.view.menu.a.3
                                                                public static ChangeQuickRedirect a;

                                                                @Override // android.content.DialogInterface.OnClickListener
                                                                public final void onClick(DialogInterface dialogInterface2, int i2) {
                                                                    Object[] objArr6 = {dialogInterface2, Integer.valueOf(i2)};
                                                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f5d0931f5898b7b7f7a27ebcb9f6199f", 6917529027641081856L)) {
                                                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f5d0931f5898b7b7f7a27ebcb9f6199f");
                                                                    } else if (interfaceC1403a2 != null && interfaceC1403a2.a(dialogInterface2, 12, iMMessage2)) {
                                                                        d.b("MenuUtils::showAdminCancelConfirmDialog: admin cancel is handled.", new Object[0]);
                                                                    } else {
                                                                        iMMessage2.setAdminUid(IMUIManager.a().e());
                                                                        if (IMUIManager.a().b(iMMessage2) != 0) {
                                                                            ad.a(view2.getContext(), (int) R.string.xm_sdk_session_msg_cancel_fail);
                                                                        }
                                                                    }
                                                                }
                                                            }).b(R.string.xm_sdk_btn_cancel, (DialogInterface.OnClickListener) null).a(true).b();
                                                            return;
                                                        }
                                                    case 13:
                                                        if (b.e()) {
                                                            return;
                                                        }
                                                        b.a(e.f.a(true, m));
                                                        return;
                                                    default:
                                                        return;
                                                }
                                        }
                                    }
                                }
                            });
                        }
                    }
                }).a(true).b();
            } catch (Exception e) {
                com.sankuai.xm.monitor.statistics.a.a("imui", "MenuUtils::showMsgLongClickMenu", e);
                d.a(e);
            }
        }
    }

    public boolean a(DialogInterface dialogInterface, int i, IMMessage iMMessage) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i), iMMessage};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8849fb449b8529ef188a73bbabe1a34b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8849fb449b8529ef188a73bbabe1a34b")).booleanValue();
        }
        if ((i != 12 || a.a(this.e, iMMessage)) && (i != 7 || a.b(this.e, iMMessage))) {
            return false;
        }
        ad.a(this.e, (int) R.string.xm_sdk_session_msg_cancel_time_out);
        return true;
    }
}
