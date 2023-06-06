package com.sankuai.xm.imui.session.view.adapter.impl;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IAudioMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AudioMsgAdapter extends BaseMsgAdapter implements IAudioMsgAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.IAudioMsgAdapter
    public boolean onPlayerEvent(int i, b<AudioMessage> bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed5ea205912a2f5ab983d62289319b0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed5ea205912a2f5ab983d62289319b0")).booleanValue();
        }
        if (i == 4) {
            ad.a(this.e, (int) R.string.xm_sdk_msg_audio_play_exception);
        }
        return false;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IAudioMsgAdapter
    public int getPlayingAnimationResource(b<AudioMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d7e472deb02d4dcfc98a624e9f11db", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d7e472deb02d4dcfc98a624e9f11db")).intValue() : bVar.g == 1 ? R.drawable.xm_sdk_selector_chat_voice_anim_left : R.drawable.xm_sdk_selector_chat_voice_anim_right;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IAudioMsgAdapter
    public int getPlayableAnimationResource(b<AudioMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27fcbb2c2c36d3274afd67b29c187e7f", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27fcbb2c2c36d3274afd67b29c187e7f")).intValue() : bVar.g == 1 ? R.drawable.xm_sdk_vd_voice_right : R.drawable.xm_sdk_vd_voice_l3;
    }
}
