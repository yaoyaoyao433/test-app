package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IAudioMsgAdapter;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AudioMsgView extends MediaMsgView<AudioMessage, IAudioMsgAdapter> {
    public static ChangeQuickRedirect a;
    private ImageView t;
    private TextView u;
    private ImageView v;
    private boolean w;
    private com.sankuai.xm.imui.session.presenter.a x;

    public AudioMsgView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ad2cb4bb74efb8342723ebc1201ec07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ad2cb4bb74efb8342723ebc1201ec07");
        }
    }

    public AudioMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d8ad428a027de59452648ed36fbcbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d8ad428a027de59452648ed36fbcbe");
        }
    }

    public void setPresenter(com.sankuai.xm.imui.session.presenter.a aVar) {
        this.x = aVar;
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3625fc03c0d2762fffffc2e25761d5", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3625fc03c0d2762fffffc2e25761d5")).intValue() : getStyle() == 1 ? R.layout.xm_sdk_chatmsg_voice_left : R.layout.xm_sdk_chatmsg_voice_right;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<AudioMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256a5397c57cfdeb84a077747f4ff6ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256a5397c57cfdeb84a077747f4ff6ec");
            return;
        }
        this.t = (ImageView) view.findViewById(R.id.xm_sdk_img_chat_msg_voice);
        this.u = (TextView) view.findViewById(R.id.xm_sdk_tv_chat_voice_dur);
        this.v = (ImageView) view.findViewById(R.id.xm_sdk_iv_chat_voice_unread);
        if (this.v != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.xm_sdk_msg_wrapper);
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ((RelativeLayout.LayoutParams) this.v.getLayoutParams()).setMargins(0, 0, -((getResources().getDimensionPixelSize(R.dimen.xm_sdk_audio_msg_unread_padding) * 2) + ((View) this.v.getParent()).getPaddingRight() + this.v.getWidth()), 0);
        }
        a(bVar, this.u);
        int playableAnimationResource = ((IAudioMsgAdapter) this.r).getPlayableAnimationResource(this.n);
        if (playableAnimationResource > 0) {
            this.t.setImageDrawable(android.support.v7.content.res.b.b(getContext(), playableAnimationResource));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedc21d82326fa62583e0b14ea217d8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedc21d82326fa62583e0b14ea217d8c");
        } else if (this.x != null && !this.x.a((AudioMessage) this.n.b)) {
            ad.a(getContext(), (int) R.string.xm_sdk_msg_audio_file_path_downloading);
        } else if (!this.w) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09e93c2d3d2da10ea17569c80ede0573", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09e93c2d3d2da10ea17569c80ede0573");
            } else if (this.x == null || this.w || ((IAudioMsgAdapter) this.r).onPlayerEvent(1, this.n)) {
            } else {
                d.b("AudioMsgView::startPlaying msg uuid = " + this.n.b(), new Object[0]);
                this.x.a(this);
            }
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "361055306f2da98f5e17c4deed3b906e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "361055306f2da98f5e17c4deed3b906e");
            } else if (this.x == null || !this.w || ((IAudioMsgAdapter) this.r).onPlayerEvent(2, this.n)) {
            } else {
                d.b("AudioMsgView::stopPlaying msg uuid = " + this.n.b(), new Object[0]);
                this.x.b(this);
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(b<AudioMessage> bVar) {
        String str;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7151c9acb11bd2ad795d026c1e49d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7151c9acb11bd2ad795d026c1e49d7");
            return;
        }
        super.a(bVar);
        this.l.getLayoutParams().width = (int) getVoiceWidth();
        TextView textView = this.u;
        short duration = bVar.b.getDuration();
        Object[] objArr2 = {Short.valueOf(duration)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6eb6d6c8d18a96a020e2bde520736e9d", 6917529027641081856L)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6eb6d6c8d18a96a020e2bde520736e9d");
        } else {
            int i = duration / 60;
            if (i <= 0) {
                str = ((int) duration) + CommonConstant.Symbol.DOUBLE_QUOTES;
            } else {
                int i2 = duration % 60;
                if (i2 != 0) {
                    str = i + CommonConstant.Symbol.SINGLE_QUOTES + i2 + CommonConstant.Symbol.DOUBLE_QUOTES;
                } else if (i == 1) {
                    str = "60\"";
                } else {
                    str = i + CommonConstant.Symbol.SINGLE_QUOTES;
                }
            }
        }
        textView.setText(str);
        if (this.x != null) {
            com.sankuai.xm.imui.session.presenter.a aVar = this.x;
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.imui.session.presenter.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "45c69dfb80ff48594b51c029ba9d0cf2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "45c69dfb80ff48594b51c029ba9d0cf2");
            } else if (getMessage() != null) {
                if (aVar.h != null && aVar.h.equals(getMessage().b())) {
                    aVar.g = new WeakReference<>(this);
                    a();
                } else {
                    b();
                }
            }
            this.x.a(bVar.b);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc7e0a967a70222c96c53bf2869726a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc7e0a967a70222c96c53bf2869726a");
            return;
        }
        super.a(i);
        if (this.v != null) {
            if (!c(this.n) && ((AudioMessage) this.n.b).getMsgStatus() != 11) {
                this.v.setVisibility(0);
            } else {
                this.v.setVisibility(8);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56b6dad59aa8b0569b94f7307b913881", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56b6dad59aa8b0569b94f7307b913881");
        } else if (this.w) {
        } else {
            this.w = true;
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.view.AudioMsgView.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09003bc34014202fdf23e97b2c51f130", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09003bc34014202fdf23e97b2c51f130");
                        return;
                    }
                    int playingAnimationResource = ((IAudioMsgAdapter) AudioMsgView.this.r).getPlayingAnimationResource(AudioMsgView.this.n);
                    if (playingAnimationResource > 0) {
                        AudioMsgView.this.t.setImageDrawable(android.support.v7.content.res.b.b(AudioMsgView.this.getContext(), playingAnimationResource));
                    }
                    if (AudioMsgView.this.v != null) {
                        AudioMsgView.this.v.setVisibility(8);
                    }
                    if (AudioMsgView.this.t.getDrawable() instanceof AnimationDrawable) {
                        ((AnimationDrawable) AudioMsgView.this.t.getDrawable()).start();
                    }
                }
            }));
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b399599ea9cd7e9a2d3098cc860de96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b399599ea9cd7e9a2d3098cc860de96");
        } else if (this.w) {
            this.w = false;
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.view.AudioMsgView.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12eb8d3edbfac45e2fe06fab2927e137", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12eb8d3edbfac45e2fe06fab2927e137");
                        return;
                    }
                    if (AudioMsgView.this.t.getDrawable() instanceof AnimationDrawable) {
                        ((AnimationDrawable) AudioMsgView.this.t.getDrawable()).stop();
                    }
                    int playableAnimationResource = ((IAudioMsgAdapter) AudioMsgView.this.r).getPlayableAnimationResource(AudioMsgView.this.n);
                    if (playableAnimationResource > 0) {
                        AudioMsgView.this.t.setImageDrawable(android.support.v7.content.res.b.b(AudioMsgView.this.getContext(), playableAnimationResource));
                    }
                }
            }));
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb09468e519b08c0288a7e97ffa57d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb09468e519b08c0288a7e97ffa57d0");
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            b();
        }
    }

    private double getVoiceWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6828eacec4e3871b7801386ce7a482af", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6828eacec4e3871b7801386ce7a482af")).doubleValue();
        }
        short duration = ((AudioMessage) this.n.b).getDuration();
        return Math.min(k.a(getContext(), 186.0f), k.a(getContext(), 72.0f) + (k.a(getContext(), 6.0f) * (duration - 1)));
    }
}
