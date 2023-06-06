package com.sankuai.waimai.business.im.chatpage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseChatFragment extends BasePvChatFragment implements com.sankuai.waimai.business.im.common.message.c {
    public static ChangeQuickRedirect a;
    public SessionId b;
    private c c;
    private long d;
    private int e;
    private int f;

    public static BaseChatFragment a(Bundle bundle, int i) {
        Object[] objArr = {bundle, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f087e7e4a45125977b7a05e027bc490a", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseChatFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f087e7e4a45125977b7a05e027bc490a");
        }
        BaseChatFragment baseChatFragment = new BaseChatFragment();
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("KEY_BASECHATFRAGMENT_BIZ_TYPE", i);
        baseChatFragment.setArguments(bundle);
        return baseChatFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void setArguments(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f028c44ffab9918d2d87a3e227ee84dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f028c44ffab9918d2d87a3e227ee84dc");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            for (String str : arguments.keySet()) {
                Object obj = arguments.get(str);
                if (obj != null) {
                    if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Short) {
                        bundle.putShort(str, ((Short) obj).shortValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str, (Parcelable) obj);
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str, (Serializable) obj);
                    }
                }
            }
        }
        super.setArguments(bundle);
    }

    @Override // com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d69c62b4ccf3cd74093e4178291a66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d69c62b4ccf3cd74093e4178291a66");
            return;
        }
        super.onAttach(context);
        getActivity();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.chatpage.BaseChatFragment.onCreate(android.os.Bundle):void");
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449ec0eb7e2cab099974808464bd7de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449ec0eb7e2cab099974808464bd7de7");
        } else {
            i.d(new com.sankuai.waimai.business.im.common.log.a().a("wmim_chatfragment").b("ChatFragment Error Params").c(str).b());
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "968181fb3ae14d47077b56ee46865f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "968181fb3ae14d47077b56ee46865f2f");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putLong("key_bundle_chat_id", this.d);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d80973859180c7222ed9cd94c55788a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d80973859180c7222ed9cd94c55788a3");
            return;
        }
        super.onStart();
        if (com.sankuai.xm.imui.b.a().d() != this.d) {
            com.sankuai.waimai.foundation.utils.log.a.b("ImMultiImpl", "onStart: chat id not equals!!!", new Object[0]);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (this.c != null) {
            this.c.b();
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d74218df77188a4460a2c2a0595ae6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d74218df77188a4460a2c2a0595ae6e");
            return;
        }
        super.onStop();
        if (this.c == null || !this.c.d()) {
            return;
        }
        this.c.bs_();
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final int e() {
        return this.e;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5125bb13a2ed1cc107a756b7d1ee13ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5125bb13a2ed1cc107a756b7d1ee13ac")).booleanValue();
        }
        if (this.c == null) {
            return super.a(bVar);
        }
        if (bVar != null && bVar.b != 0) {
            this.c.a(bVar.b);
        }
        return this.c.a(bVar);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a93e70bad70e8af328d94b95b0b74c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a93e70bad70e8af328d94b95b0b74c7")).booleanValue();
        }
        Object[] objArr2 = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2d434de95bdddc8fd32398c84c021d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2d434de95bdddc8fd32398c84c021d4");
        } else if (i == 0) {
            com.sankuai.waimai.business.im.common.log.b.a("send_message", String.valueOf(i));
        } else {
            HashMap hashMap = new HashMap();
            if (bVar != null && bVar.b != 0) {
                hashMap.put("channel", String.valueOf((int) bVar.b.getChannel()));
                hashMap.put("id", String.valueOf(bVar.b.getMsgId()));
                hashMap.put("time", String.valueOf(bVar.i()));
                hashMap.put("category", String.valueOf(bVar.b.getCategory()));
                if (16 == MsgViewType.a(bVar.b)) {
                    hashMap.put("type", String.valueOf(IMMessageAdapter.a((GeneralMessage) bVar.b)));
                }
            }
            com.sankuai.waimai.business.im.common.log.b.a("send_message", String.valueOf(i), "发送消息失败", hashMap);
        }
        if (this.c != null && bVar != null && bVar.b != 0) {
            this.c.a(i, bVar.b);
        }
        if (i == 0 && this.c != null) {
            this.c.a_(0L);
        }
        if (i == 10100) {
            return true;
        }
        return super.a(i, bVar);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final IMsgViewAdapter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41957c83bce22598bd82eb9a0c1f9bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41957c83bce22598bd82eb9a0c1f9bb6");
        }
        if (this.c != null) {
            return this.c.e();
        }
        return super.d();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final ISendPanelAdapter bo_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2771f671aa55aa103c688457845d7508", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2771f671aa55aa103c688457845d7508");
        }
        if (this.c != null) {
            return this.c.bq_();
        }
        return super.bo_();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41923381991776535a801093ca2ca4d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41923381991776535a801093ca2ca4d4");
        }
        if (this.c != null) {
            return this.c.g();
        }
        return super.a();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final void F_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d5286599628c57208e0c3e9d624b5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d5286599628c57208e0c3e9d624b5c");
        } else if (com.sankuai.waimai.imbase.manager.b.a().e()) {
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(getContext());
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.a
    public final IBannerAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6965308765172e35c5f3220ae6235557", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6965308765172e35c5f3220ae6235557");
        }
        if (this.c == null) {
            return null;
        }
        return new IBannerAdapter() { // from class: com.sankuai.waimai.business.im.chatpage.BaseChatFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
            public boolean isOverlay() {
                return false;
            }

            @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
            public void onDestroy() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9eb79f7928a5a5179128b7ae124a01f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9eb79f7928a5a5179128b7ae124a01f8");
                }
            }

            @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
            public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Object[] objArr2 = {layoutInflater, viewGroup};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b676b09c6e4bccf1fa023a4c33f3342d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b676b09c6e4bccf1fa023a4c33f3342d");
                }
                if (BaseChatFragment.this.c == null) {
                    return null;
                }
                return BaseChatFragment.this.c.a(layoutInflater, viewGroup);
            }
        };
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b7a96dacc59f1322c15943946966b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b7a96dacc59f1322c15943946966b0");
            return;
        }
        if (this.c != null) {
            this.c.al_();
        }
        super.onDestroyView();
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11237a72d4c729204545c424bc1b865f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11237a72d4c729204545c424bc1b865f");
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            this.c.k();
        }
    }

    @Override // com.sankuai.waimai.business.im.common.message.c
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f49fe758172698e795f518371b0911a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f49fe758172698e795f518371b0911a0");
        } else if (this.c != null) {
            this.c.a(j);
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e8793471ceb2666ea722a75fea42f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e8793471ceb2666ea722a75fea42f3");
            return;
        }
        super.onPause();
        if (this.c != null) {
            this.c.br_();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b7acbb955de9e402a8ef474aaa1a15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b7acbb955de9e402a8ef474aaa1a15");
            return;
        }
        super.onResume();
        if (this.c != null) {
            this.c.an_();
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50b4c1384ee6f480aa635971f17bfb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50b4c1384ee6f480aa635971f17bfb6");
            return;
        }
        super.a(aVar);
        if (this.f == 11) {
            aVar.a("i_source", 2);
        }
        this.c.a(aVar);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd96a7c4cdabbc274894f2c702cf925", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd96a7c4cdabbc274894f2c702cf925")).booleanValue() : this.c.n();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f19ece9f5668568ff145bfca73507198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f19ece9f5668568ff145bfca73507198");
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.c != null) {
            this.c.a(view, bundle);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d21ac53574242b0232ecdf32c038da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d21ac53574242b0232ecdf32c038da");
        } else {
            super.a(z);
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, list, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32872d7fa0f1c13e754bcca9c719808b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32872d7fa0f1c13e754bcca9c719808b");
            return;
        }
        if (this.c != null) {
            this.c.a(i, str, list, i2, z);
        }
        super.a(i, str, list, i2, z);
    }
}
