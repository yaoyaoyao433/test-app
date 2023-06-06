package com.sankuai.xm.imui.session.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.vcard.h;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.processors.LinkProcessor;
import com.sankuai.xm.imui.common.processors.d;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.ContentRelativeLayout;
import com.sankuai.xm.imui.common.view.LinkTextView;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import com.sankuai.xm.imui.session.event.e;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.theme.c;
import com.sankuai.xm.integration.imageloader.shape.ImageShape;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseCommonView<M extends IMMessage, CA extends IExtraAdapter<M>> extends RelativeLayout implements com.sankuai.xm.im.vcard.b {
    public static ChangeQuickRedirect b;
    private ContentRelativeLayout a;
    protected final String c;
    protected d d;
    protected boolean e;
    protected RelativeLayout f;
    protected TextView g;
    protected View h;
    protected View i;
    protected View j;
    protected int k;
    protected View l;
    protected CheckBox m;
    protected com.sankuai.xm.imui.session.entity.b<M> n;
    protected Context o;
    protected ArrayList<com.sankuai.xm.imui.common.view.message.a> p;
    protected ICommonAdapter q;
    protected CA r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private ICommonAdapter w;

    public void a(View view) {
    }

    public abstract void a(View view, com.sankuai.xm.imui.session.entity.b<M> bVar);

    public abstract int getContentLayoutResourceId();

    public BaseCommonView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f3cbb7ba9dc83ec6b1105a728e30ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f3cbb7ba9dc83ec6b1105a728e30ee");
        }
    }

    private BaseCommonView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7edfce923ff9d24b8cf090ba4b1cfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7edfce923ff9d24b8cf090ba4b1cfe");
        }
    }

    public BaseCommonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd9fa6dc4674593c2d52f4416d64607", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd9fa6dc4674593c2d52f4416d64607");
            return;
        }
        this.c = getClass().getName();
        this.e = true;
        this.p = new ArrayList<>();
        this.o = context;
        this.t = true;
        this.d = new d();
        this.w = com.sankuai.xm.imui.session.b.a((View) this).u().a();
    }

    public d getMarkupParser() {
        return this.d;
    }

    public void setMarkupParser(d dVar) {
        this.d = dVar;
    }

    public final void a(com.sankuai.xm.imui.session.entity.b<M> bVar, @NonNull ICommonAdapter iCommonAdapter, @NonNull CA ca) {
        Drawable newDrawable;
        int i;
        Object[] objArr = {bVar, iCommonAdapter, ca};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596e671a714110e8730453777c3f9002", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596e671a714110e8730453777c3f9002");
            return;
        }
        this.n = bVar;
        this.q = iCommonAdapter;
        this.r = ca;
        this.v = this.q.getStyle(this.n);
        LinkProcessor linkProcessor = new LinkProcessor();
        linkProcessor.c = this.q.hasLinkTextUnderLine(bVar);
        linkProcessor.b = this.q.getLinkColor(bVar);
        linkProcessor.a(this.q.getTextLinkSchema());
        Object[] objArr2 = {linkProcessor};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ed0dd66be06652baa0d11ef0375aa15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ed0dd66be06652baa0d11ef0375aa15");
        } else if (getMarkupParser() == null) {
            d dVar = new d();
            dVar.a(linkProcessor);
            setMarkupParser(dVar);
        } else {
            getMarkupParser().a(linkProcessor);
        }
        Object[] objArr3 = {bVar};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b106ffb23bee74982571e6f10063689a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b106ffb23bee74982571e6f10063689a");
            return;
        }
        View inflate = inflate(this.o, R.layout.xm_sdk_chat_msg_frame, this);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.xm_sdk_msg_wrapper_stub);
        int i2 = R.layout.xm_sdk_chat_msg_bubble_left;
        if (getStyle() == 2) {
            i2 = R.layout.xm_sdk_chat_msg_bubble_right;
        }
        viewStub.setLayoutResource(i2);
        viewStub.inflate();
        this.a = (ContentRelativeLayout) inflate.findViewById(R.id.xm_sdk_rl_chatmsg_content);
        if (getStyle() == 3) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.a.getLayoutParams();
            layoutParams.removeRule(17);
            layoutParams.removeRule(16);
            layoutParams.removeRule(0);
            layoutParams.removeRule(1);
            layoutParams.addRule(14);
        }
        this.u = getChildAt(0).getPaddingStart() + getChildAt(0).getPaddingEnd();
        this.j = inflate.findViewById(R.id.xm_sdk_img_chat_msg_portrait);
        ViewStub viewStub2 = (ViewStub) inflate.findViewById(R.id.xm_sdk_rl_chatmsg_content_stub);
        int contentLayoutResourceId = getContentLayoutResourceId();
        if (contentLayoutResourceId == 0) {
            contentLayoutResourceId = R.layout.xm_sdk_empty;
        }
        viewStub2.setLayoutResource(contentLayoutResourceId);
        this.l = viewStub2.inflate();
        int topSideLayout = this.q.getTopSideLayout(getContext(), this.n);
        if (topSideLayout != 0) {
            a((ViewStub) ((ViewStub) inflate.findViewById(R.id.xm_sdk_chat_msg_top_side_container)).inflate().findViewById(R.id.xm_sdk_msg_side_view), topSideLayout, 60, 0);
        }
        if (c(bVar)) {
            switch (this.q.getStatusGravity(getMessage())) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 2;
                    break;
                default:
                    i = 0;
                    break;
            }
            this.h = ((ViewStub) findViewById(R.id.xm_sdk_chat_msg_status)).inflate();
            a((ViewStub) this.h.findViewById(R.id.xm_sdk_msg_side_view), R.layout.xm_sdk_msg_status, 3, i);
        }
        int innerSideLayout = this.q.getInnerSideLayout(getContext(), this.n);
        if (innerSideLayout != 0) {
            this.i = ((ViewStub) inflate.findViewById(R.id.xm_sdk_chat_msg_inner_side_container)).inflate();
            a((ViewStub) this.i.findViewById(R.id.xm_sdk_msg_side_view), innerSideLayout, 3, 0);
        }
        int bottomSideLayout = this.q.getBottomSideLayout(getContext(), this.n);
        if (bottomSideLayout != 0) {
            a((ViewStub) ((ViewStub) inflate.findViewById(R.id.xm_sdk_chat_msg_bottom_side_container)).inflate().findViewById(R.id.xm_sdk_msg_side_view), bottomSideLayout, 60, 0);
        }
        this.m = (CheckBox) inflate.findViewById(R.id.xm_sdk_msg_check_box);
        if (this.m != null) {
            inflate.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr4 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "743a5e295ebbafd1515a5a5a906db1e5", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "743a5e295ebbafd1515a5a5a906db1e5")).booleanValue();
                    }
                    if (com.sankuai.xm.imui.session.b.b(BaseCommonView.this.getContext()).e()) {
                        BaseCommonView.this.m.setChecked(true ^ BaseCommonView.this.m.isChecked());
                    }
                    return false;
                }
            });
            this.m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object[] objArr4 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b09523594a73201a357792702b9d63cd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b09523594a73201a357792702b9d63cd");
                    } else if (BaseCommonView.this.n.m == z) {
                    } else {
                        BaseCommonView.this.n.m = z;
                        com.sankuai.xm.imui.session.b.b(BaseCommonView.this.getContext()).a(e.c.a(z, BaseCommonView.this.getMessage().b));
                    }
                }
            });
        }
        if (this.l != null) {
            com.sankuai.xm.imui.theme.b a2 = c.a().a(this.n.b.getChannel());
            int backgroundResource = this.q.getBackgroundResource(bVar);
            Drawable drawable = null;
            if (backgroundResource == this.w.getBackgroundResource(bVar) && a2 != null) {
                c a3 = c.a();
                int a4 = MsgViewType.a(this.n.b);
                Object[] objArr4 = {Integer.valueOf(a4)};
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "5637f74554d7a71b885d914fea77c67e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "5637f74554d7a71b885d914fea77c67e")).booleanValue() : c.b.contains(Integer.valueOf(a4))) {
                    if (getStyle() == 2) {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.imui.theme.b.a;
                        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "8d8fd2dacf025ec5a231e8b79f8581cc", 6917529027641081856L)) {
                            newDrawable = (Drawable) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "8d8fd2dacf025ec5a231e8b79f8581cc");
                        } else if (a2.t != null && a2.t.getConstantState() != null) {
                            newDrawable = a2.t.getConstantState().newDrawable();
                        }
                        drawable = newDrawable;
                    } else {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.xm.imui.theme.b.a;
                        if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "f6914d5d439d63893ed083a510256508", 6917529027641081856L)) {
                            newDrawable = (Drawable) PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "f6914d5d439d63893ed083a510256508");
                        } else if (a2.s != null && a2.s.getConstantState() != null) {
                            newDrawable = a2.s.getConstantState().newDrawable();
                        }
                        drawable = newDrawable;
                    }
                }
            }
            if (drawable == null && backgroundResource != 0) {
                drawable = android.support.v7.content.res.b.b(this.o, backgroundResource);
            }
            ViewCompat.setBackground(this.l, drawable);
            int[] padding = this.q.getPadding(bVar);
            if (padding != null && padding.length == 4) {
                ViewCompat.setPaddingRelative(this.l, padding[0], padding[1], padding[2], padding[3]);
            }
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ad4cf83c903b09f7900003bd6dc88d7a", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ad4cf83c903b09f7900003bd6dc88d7a");
                        return;
                    }
                    int a5 = com.sankuai.xm.imui.common.report.a.a(BaseCommonView.this.n.b.getMsgType());
                    com.sankuai.xm.imui.common.report.a.a(a5, BaseCommonView.this.c);
                    com.sankuai.xm.log.c.b("session_click", "%s::dealVCard::%s %s", BaseCommonView.this.c, Integer.valueOf(a5), BaseCommonView.this.c);
                    if (com.sankuai.xm.imui.session.b.b(BaseCommonView.this.getContext()).e() && BaseCommonView.this.m != null) {
                        BaseCommonView.this.m.performClick();
                    } else if (BaseCommonView.this.q.onClick(BaseCommonView.this, BaseCommonView.this.n)) {
                    } else {
                        BaseCommonView.this.a(BaseCommonView.this.l);
                    }
                }
            });
            this.l.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6069d96764a9103cfc948a96096527cf", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6069d96764a9103cfc948a96096527cf")).booleanValue() : com.sankuai.xm.imui.session.b.b(BaseCommonView.this.getContext()).e() || BaseCommonView.this.q.onLongClick(BaseCommonView.this, BaseCommonView.this.n);
                }
            });
            a(this.l, bVar);
        }
    }

    public int getStyle() {
        return this.v;
    }

    public com.sankuai.xm.imui.session.entity.b<M> getMessage() {
        return this.n;
    }

    public void setMessage(com.sankuai.xm.imui.session.entity.b<M> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f3f44f9bd6fb806f65105465d8fd02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f3f44f9bd6fb806f65105465d8fd02");
            return;
        }
        this.n = bVar;
        a(bVar);
        if (this.q.getNickNameVisibility(bVar) == 0 || this.q.getAvatarVisibility(bVar) == 0) {
            Activity a2 = ActivityUtils.a(getContext());
            if (!(a2 != null) || ActivityUtils.a(a2)) {
                final IMUIManager a3 = IMUIManager.a();
                final M m = bVar.b;
                final b bVar2 = new b(this, this.n);
                Object[] objArr2 = {m, bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = IMUIManager.a;
                if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "227a18230e430a00c6cf2ed97d03dbb9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "227a18230e430a00c6cf2ed97d03dbb9");
                    return;
                }
                final h a4 = h.a();
                final com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar = new com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.sankuai.xm.imui.IMUIManager.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(Object obj) {
                        com.sankuai.xm.im.vcard.entity.a aVar2 = (com.sankuai.xm.im.vcard.entity.a) obj;
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c742eb347704a4b2a368b828ee51329", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c742eb347704a4b2a368b828ee51329");
                            return;
                        }
                        if (bVar2 != null) {
                            bVar2.onSuccess(aVar2);
                        } else {
                            StringBuilder sb = new StringBuilder("IMUIManager=>getVCardByMessage.onSuccess=>callback = null, uiinfo:");
                            sb.append(aVar2 == null ? "" : aVar2.d);
                            com.sankuai.xm.imui.common.util.d.d(sb.toString(), new Object[0]);
                        }
                        IMUIManager.a(IMUIManager.this, aVar2);
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i, String str) {
                        Object[] objArr3 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27ef9a66d76a620028845dd74f811089", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27ef9a66d76a620028845dd74f811089");
                            return;
                        }
                        if (bVar2 != null) {
                            bVar2.onFailure(i, str);
                        }
                        com.sankuai.xm.imui.common.util.d.d("MessageTransferManger=>getVCardByMessage=>queryUIInfoByMessage=>code:" + i + ", message:" + str, new Object[0]);
                    }
                };
                Object[] objArr3 = {m, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "fad00ca4d046a90bdaf81abd8c5fc4af", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "fad00ca4d046a90bdaf81abd8c5fc4af");
                } else {
                    com.sankuai.xm.threadpool.scheduler.a.b().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.h.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "040c35416236ceba2fe8ac14862d5a1e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "040c35416236ceba2fe8ac14862d5a1e");
                            } else if (m.getChannel() == -1 || !h.a(h.this, m, aVar)) {
                                d a5 = d.a(m.getDefaultSenderUid(), m.getDefaultSenderType(), m.getChannel(), m.getMsgUuid(), m.getCategory());
                                a5.e = m.getSID();
                                h.b(h.this, a5, aVar);
                            }
                        }
                    }));
                }
            }
        }
    }

    public void setShowTimeStamp(boolean z) {
        this.t = z;
    }

    public CA getExtraAdapter() {
        return this.r;
    }

    public ICommonAdapter getCommonAdapter() {
        return this.q;
    }

    public final void a(com.sankuai.xm.imui.session.entity.b<M> bVar, TextView textView) {
        Object[] objArr = {bVar, textView};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b4973e161134665a31b3574d4fc4731", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b4973e161134665a31b3574d4fc4731");
        } else if (textView != null) {
            textView.setTextColor(this.q.getTextColor(bVar));
            textView.setTextSize(0, this.q.getTextFontSize(bVar));
            textView.setLineSpacing(this.q.getLineSpacingExtra(bVar), 1.0f);
        }
    }

    public final void a(TextView textView, CharSequence charSequence) {
        Object[] objArr = {textView, charSequence};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0bdabb46dd8f28def7090c96e3fe6f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0bdabb46dd8f28def7090c96e3fe6f2");
        } else if (textView != null) {
            textView.setText(getMarkupParser().a(charSequence));
        }
    }

    public final void a(final LinkTextView linkTextView, final com.sankuai.xm.imui.session.entity.b<M> bVar) {
        Object[] objArr = {linkTextView, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3dcf3441c3a6f8872f41a43a04b1163", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3dcf3441c3a6f8872f41a43a04b1163");
        } else if (linkTextView != null) {
            linkTextView.setOnLinkClickListener(new LinkTextView.b() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.imui.common.view.LinkTextView.b
                public final boolean a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "809a5a9249df074547ee31fbe271c8d0", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "809a5a9249df074547ee31fbe271c8d0")).booleanValue();
                    }
                    linkTextView.setTag(bVar);
                    return BaseCommonView.this.q.onTextLinkClick(linkTextView, str);
                }
            });
            linkTextView.setOnLongClickListener(l.b);
            linkTextView.setOnLongLinkClickListener(new LinkTextView.c() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.imui.common.view.LinkTextView.c
                public final boolean a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd7a3931474e66ce212f3a9dcbe44471", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd7a3931474e66ce212f3a9dcbe44471")).booleanValue() : BaseCommonView.this.q.onLongClick(BaseCommonView.this, bVar);
                }
            });
            a(bVar, linkTextView);
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142c1e14301ce199f659f346fce17a18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142c1e14301ce199f659f346fce17a18");
        } else if (this.n != null) {
            this.n.b.setMsgStatus(i);
            d(this.n);
        }
    }

    public final void b(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff9ce0726e46f0a8e444186c34734233", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff9ce0726e46f0a8e444186c34734233");
        } else if (bVar == null || this.n == null) {
        } else {
            c();
            Iterator<com.sankuai.xm.imui.common.view.message.a> it = this.p.iterator();
            while (it.hasNext()) {
                com.sankuai.xm.imui.common.view.message.a next = it.next();
                if (next instanceof AbstractMsgSideView) {
                    ((AbstractMsgSideView) next).a(bVar, 4);
                } else {
                    next.e(bVar);
                }
            }
        }
    }

    public void setMultiSelectBtn(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b490f15ffa9db68564b051f0228995c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b490f15ffa9db68564b051f0228995c");
        } else if (this.m != null) {
            this.m.setChecked(z);
        }
    }

    public void a(com.sankuai.xm.imui.session.entity.b<M> bVar) {
        boolean z = true;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5822e10d2955778785e37975e9af62a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5822e10d2955778785e37975e9af62a");
        } else if (bVar == null) {
        } else {
            this.n = bVar;
            Iterator<com.sankuai.xm.imui.common.view.message.a> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
            if (this.q != null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99d5d4da12ecd4d91c17a5f0386027c7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99d5d4da12ecd4d91c17a5f0386027c7");
                } else {
                    int timeStampVisibility = this.q.getTimeStampVisibility(this.n);
                    String timeStamp = this.q.getTimeStamp(this.n);
                    if (this.t && timeStampVisibility == 0 && timeStamp != null) {
                        if (this.f == null) {
                            this.f = (RelativeLayout) ((ViewStub) findViewById(R.id.xm_sdk_chat_msg_time)).inflate();
                            this.g = (TextView) this.f.findViewById(R.id.xm_sdk_tv_chat_msg_time);
                        }
                        this.g.setText(timeStamp);
                        l.a(0, this.f);
                    } else {
                        l.a(8, this.f);
                    }
                }
                b();
                b(bVar);
                a(bVar.b.getMsgStatus());
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "869cc5e6e3796d5e564e60ac22dee2f0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "869cc5e6e3796d5e564e60ac22dee2f0");
                } else if (bVar != null && this.n != null) {
                    c();
                    Iterator<com.sankuai.xm.imui.common.view.message.a> it2 = this.p.iterator();
                    while (it2.hasNext()) {
                        com.sankuai.xm.imui.common.view.message.a next = it2.next();
                        if (next instanceof AbstractMsgSideView) {
                            ((AbstractMsgSideView) next).a(bVar, 16);
                        }
                    }
                }
                Object[] objArr4 = {bVar};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "699036ce8ddc31f883e8ba2fa360cab4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "699036ce8ddc31f883e8ba2fa360cab4");
                } else if (this.m != null) {
                    com.sankuai.xm.imui.session.b b2 = com.sankuai.xm.imui.session.b.b(getContext());
                    z = (!b2.e() || Arrays.binarySearch(b2.c.c(), bVar.b.getMsgType()) < 0) ? false : false;
                    this.m.setVisibility(z ? 0 : 8);
                    this.m.setChecked(bVar.m);
                    if (z || !this.m.isChecked()) {
                        return;
                    }
                    this.m.setChecked(false);
                }
            }
        }
    }

    private void a() {
        ImageShape aVar;
        com.sankuai.xm.imui.theme.b a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b324994b1be843237989d22927e1dc9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b324994b1be843237989d22927e1dc9b");
        } else if (this.j == null) {
        } else {
            this.k = this.q.getDefaultAvatarDrawableResource(this.n);
            int avatarSize = this.q.getAvatarSize(this.n);
            if (avatarSize <= 0) {
                avatarSize = getResources().getDimensionPixelSize(R.dimen.xm_sdk_chat_msg_portrait_size);
            }
            int max = Math.max(this.q.getAvatarCornerRadius(this.n), 0);
            if (max * 2 > avatarSize) {
                this.s = true;
                max = avatarSize / 2;
            }
            int avatarVisibility = this.q.getAvatarVisibility(this.n);
            if (avatarVisibility != 8) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
                if (avatarVisibility == 0) {
                    layoutParams.width = avatarSize;
                    layoutParams.height = avatarSize;
                    l.a(0, this.j);
                } else {
                    l.a(8, this.j);
                }
                this.a.b = this.e;
                if (this.e) {
                    this.a.setMaxWidth((k.b(getContext()) - this.u) - (((avatarSize + layoutParams.getMarginStart()) + layoutParams.getMarginEnd()) * 2));
                }
            } else {
                l.a(8, this.j);
                this.a.b = false;
                this.a.setMaxWidth(0);
            }
            if (this.n == null || avatarVisibility != 0) {
                return;
            }
            if (this.s) {
                aVar = new com.sankuai.xm.integration.imageloader.shape.b();
            } else {
                aVar = new com.sankuai.xm.integration.imageloader.shape.a(max);
            }
            if (ac.a(this.n.c)) {
                if (this.k == this.w.getDefaultAvatarDrawableResource(this.n) && (a2 = c.a().a(this.n.b.getChannel())) != null && a2.q != null) {
                    this.k = a2.q.intValue();
                }
                com.sankuai.xm.integration.imageloader.b.a(getContext(), this.k).a(aVar).a(this.j);
            } else {
                com.sankuai.xm.integration.imageloader.b.a(this.n.c).a(1).a(aVar).b(this.k).c(this.k).a(this.j);
            }
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d6f0c3340b66099503f15406bc7cb80", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d6f0c3340b66099503f15406bc7cb80");
                        return;
                    }
                    com.sankuai.xm.imui.common.report.a.b(101);
                    com.sankuai.xm.log.c.b("session_click", "%s::dealVCard::%s %s", BaseCommonView.this.c, 101, "MSG_AVATAR");
                    BaseCommonView.this.q.onAvatarClick(BaseCommonView.this.j, BaseCommonView.this.n);
                }
            });
            this.j.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.8
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "105a4b80f9f88ebe414f18d080170dfd", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "105a4b80f9f88ebe414f18d080170dfd")).booleanValue() : BaseCommonView.this.q.onAvatarLongClick(BaseCommonView.this.j, BaseCommonView.this.n);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d5031ac8e6ccc41465aac08c971d1a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d5031ac8e6ccc41465aac08c971d1a7");
            return;
        }
        a();
        e(this.n);
    }

    private void d(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83df05a55d782fe4ce00e5c5569848ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83df05a55d782fe4ce00e5c5569848ab");
            return;
        }
        c();
        Iterator<com.sankuai.xm.imui.common.view.message.a> it = this.p.iterator();
        while (it.hasNext()) {
            com.sankuai.xm.imui.common.view.message.a next = it.next();
            if (next instanceof AbstractMsgSideView) {
                ((AbstractMsgSideView) next).a(bVar, 1);
            } else {
                next.d(bVar);
            }
        }
    }

    private void e(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16f427c1e02bc3044e3e4e9a47c21bb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16f427c1e02bc3044e3e4e9a47c21bb7");
            return;
        }
        c();
        Iterator<com.sankuai.xm.imui.common.view.message.a> it = this.p.iterator();
        while (it.hasNext()) {
            com.sankuai.xm.imui.common.view.message.a next = it.next();
            if (next instanceof AbstractMsgSideView) {
                ((AbstractMsgSideView) next).a(bVar, 8);
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f994be03b1c8818b6191c1ae16e27b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f994be03b1c8818b6191c1ae16e27b4");
        } else if (this.i != null) {
            if (!c(this.n) || (this.n.c() >= 5 && this.n.c() != 14)) {
                l.a(8, this.h);
                l.a(0, this.i);
                return;
            }
            l.a(8, this.i);
            l.a(0, this.h);
        }
    }

    @Override // com.sankuai.xm.im.vcard.b
    public final void a(long j, final com.sankuai.xm.im.vcard.entity.a aVar) {
        Object[] objArr = {new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "655356c8541410e27c51416b9ab049e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "655356c8541410e27c51416b9ab049e5");
        } else if (aVar == null) {
        } else {
            post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.view.BaseCommonView.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6e67f3c47a3c356a7cb86c22ff71250", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6e67f3c47a3c356a7cb86c22ff71250");
                    } else if (aVar.e == BaseCommonView.this.n.b.getFromUid()) {
                        BaseCommonView.this.b();
                    }
                }
            }));
        }
    }

    public final <T> List<T> a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7860f4a8c8a6492680e8a9179f5abc40", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7860f4a8c8a6492680e8a9179f5abc40");
        }
        ArrayList arrayList = new ArrayList();
        if (getParent() instanceof ListView) {
            ListView listView = (ListView) getParent();
            int lastVisiblePosition = (listView.getLastVisiblePosition() - listView.getFirstVisiblePosition()) + 1;
            for (int i = 0; i < lastVisiblePosition; i++) {
                View childAt = listView.getChildAt(i);
                if (cls.isInstance(childAt)) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    private View a(ViewStub viewStub, int i, int i2, int i3) {
        Object[] objArr = {viewStub, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59c2ad43f4df054aa0f75ad2192cf0d", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59c2ad43f4df054aa0f75ad2192cf0d");
        }
        if (i == 0) {
            i = viewStub.getLayoutResource();
        }
        if (i2 == 0) {
            i2 = -1;
        }
        if (i == 0 || i == -1) {
            return null;
        }
        viewStub.setLayoutResource(i);
        viewStub.setInflatedId(viewStub.getId());
        viewStub.setOnInflateListener(new a(i2, i3));
        return viewStub.inflate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements ViewStub.OnInflateListener {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;

        public a(int i, int i2) {
            Object[] objArr = {BaseCommonView.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fdf21395441d1443015c35c07231efc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fdf21395441d1443015c35c07231efc");
                return;
            }
            this.c = i;
            this.d = i2;
        }

        @Override // android.view.ViewStub.OnInflateListener
        public final void onInflate(ViewStub viewStub, View view) {
            int i;
            XmlResourceParser layout;
            int next;
            Object[] objArr = {viewStub, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b01388f8ec1edf953297d6a8908242", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b01388f8ec1edf953297d6a8908242");
                return;
            }
            if (view instanceof com.sankuai.xm.imui.common.view.message.a) {
                BaseCommonView.this.p.add((com.sankuai.xm.imui.common.view.message.a) view);
            }
            RelativeLayout.LayoutParams layoutParams = null;
            try {
                layout = BaseCommonView.this.getResources().getLayout(viewStub.getLayoutResource());
                do {
                    next = layout.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
            } catch (Exception e) {
                com.sankuai.xm.imui.common.util.d.a(e);
                com.sankuai.xm.monitor.statistics.a.a("imui", "MsgSideViewInflaterListener::onInflate", e);
            }
            if (next != 2) {
                throw new InflateException(layout.getPositionDescription() + ": No start tag found!");
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            TypedArray obtainStyledAttributes = BaseCommonView.this.getContext().obtainStyledAttributes(asAttributeSet, new int[]{R.attr.align_msg_content});
            if (this.d == 0) {
                this.d = obtainStyledAttributes.getInt(0, 0);
            }
            obtainStyledAttributes.recycle();
            layoutParams = new RelativeLayout.LayoutParams(BaseCommonView.this.getContext(), asAttributeSet);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) ((RelativeLayout) view.getParent()).getLayoutParams();
            if (this.d != 0 && this.c != 0 && BaseCommonView.this.n != null) {
                boolean z = ((this.d & this.c) & 16) == 16;
                boolean z2 = ((this.d & this.c) & 32) == 32;
                if (z || z2) {
                    layoutParams2.addRule(18, 0);
                    layoutParams2.addRule(19, 0);
                    layoutParams2.addRule(7, 0);
                    layoutParams2.addRule(5, 0);
                    if (z) {
                        if (BaseCommonView.this.getStyle() == 2) {
                            layoutParams2.addRule(5, R.id.xm_sdk_rl_chatmsg_content);
                        } else {
                            layoutParams2.addRule(7, R.id.xm_sdk_rl_chatmsg_content);
                        }
                    }
                    if (z2) {
                        if (BaseCommonView.this.getStyle() == 2) {
                            layoutParams2.addRule(7, R.id.xm_sdk_rl_chatmsg_content);
                        } else {
                            layoutParams2.addRule(5, R.id.xm_sdk_rl_chatmsg_content);
                        }
                    }
                }
                boolean z3 = ((this.d & this.c) & 1) == 1;
                boolean z4 = ((this.c & this.d) & 2) == 2;
                if (z3 || z4) {
                    layoutParams2.addRule(6, 0);
                    layoutParams2.addRule(8, 0);
                    if (z4) {
                        layoutParams2.addRule(8, R.id.xm_sdk_rl_chatmsg_content);
                    }
                    if (z3) {
                        layoutParams2.addRule(6, R.id.xm_sdk_rl_chatmsg_content);
                    }
                }
                boolean z5 = ((this.c & this.d) & 4) == 4;
                boolean z6 = ((this.c & this.d) & 8) == 8;
                if (z5 || z6) {
                    layoutParams2.addRule(18, 0);
                    layoutParams2.addRule(19, 0);
                    layoutParams2.addRule(5, 0);
                    layoutParams2.addRule(7, 0);
                    if (z5) {
                        i = R.id.xm_sdk_rl_chatmsg_content;
                        layoutParams2.addRule(5, R.id.xm_sdk_rl_chatmsg_content);
                    } else {
                        i = R.id.xm_sdk_rl_chatmsg_content;
                    }
                    if (z6) {
                        layoutParams2.addRule(7, i);
                    }
                }
                if (view.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    if ((z5 && z6) || (z && z2)) {
                        layoutParams3.addRule(14);
                    }
                    if (z4 && z3) {
                        layoutParams3.addRule(15);
                    }
                }
                ((RelativeLayout) view.getParent()).setLayoutParams(layoutParams2);
            }
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                if (layoutParams.width > 0 || layoutParams.height > 0) {
                    layoutParams4.width = layoutParams.width;
                    layoutParams4.height = layoutParams.height;
                }
                layoutParams4.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                view.setLayoutParams(layoutParams4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends com.sankuai.xm.im.d<com.sankuai.xm.im.vcard.entity.a> {
        public static ChangeQuickRedirect a;
        private WeakReference<BaseCommonView> b;
        private com.sankuai.xm.imui.session.entity.b c;

        @Override // com.sankuai.xm.im.d
        public final /* synthetic */ void b_(com.sankuai.xm.im.vcard.entity.a aVar) {
            com.sankuai.xm.im.vcard.entity.a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b821f5981eaafbad73b584454431b00e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b821f5981eaafbad73b584454431b00e");
                return;
            }
            BaseCommonView baseCommonView = this.b.get();
            if (aVar2 == null || baseCommonView == null || !ActivityUtils.a(ActivityUtils.a(baseCommonView.getContext()))) {
                return;
            }
            this.c.c = aVar2.b;
            this.c.d = aVar2.d;
            baseCommonView.b();
        }

        public b(BaseCommonView baseCommonView, com.sankuai.xm.imui.session.entity.b bVar) {
            Object[] objArr = {baseCommonView, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a10992de3518e6c2207a9d57d1ba03", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a10992de3518e6c2207a9d57d1ba03");
                return;
            }
            this.b = new WeakReference<>(baseCommonView);
            this.c = bVar;
        }
    }

    public final boolean c(com.sankuai.xm.imui.session.entity.b<M> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cd57065b08289e83551ab7dff86586e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cd57065b08289e83551ab7dff86586e")).booleanValue() : (bVar == null || bVar.b == null || bVar.b.getFromUid() != IMUIManager.a().e()) ? false : true;
    }
}
