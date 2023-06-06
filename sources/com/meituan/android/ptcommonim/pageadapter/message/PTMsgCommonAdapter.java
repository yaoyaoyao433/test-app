package com.meituan.android.ptcommonim.pageadapter.message;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.PopupWindowCompat;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.pageadapter.message.utils.e;
import com.meituan.android.ptcommonim.utils.d;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ColorUtils;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.UNKnownMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.view.LinkTextView;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTMsgCommonAdapter extends CommonAdapter {
    public static ChangeQuickRedirect a;
    private final e b;

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public final int getProgressBarResource(b bVar) {
        return R.drawable.ptim_pending_send_progress_bar;
    }

    public PTMsgCommonAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "920aeb65e93c5281ca3175630828c2fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "920aeb65e93c5281ca3175630828c2fa");
        } else {
            this.b = new e();
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getNickNameVisibility(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734d42d4db0a58aaf7d51041d9cc9c1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734d42d4db0a58aaf7d51041d9cc9c1c")).intValue();
        }
        if (bVar.f() == 2 && bVar.a().getCategory() == 2) {
            return 0;
        }
        if (1032 == bVar.a().getChannel() || 1053 == bVar.a().getChannel()) {
            return 8;
        }
        return super.getNickNameVisibility(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonClickAdapter
    public boolean onClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc148cb3cf6c118ac5144ecb8f89682", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc148cb3cf6c118ac5144ecb8f89682")).booleanValue();
        }
        if (bVar != null && view != null) {
            if (bVar.a() instanceof VideoMessage) {
                Context context = view.getContext();
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e6f2e1304e938e00ea75579dda901857", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e6f2e1304e938e00ea75579dda901857");
                } else {
                    Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_v1s90m55_mc", f.a(context), "c_group_hjkzttqg");
                }
            } else if (bVar.a() instanceof ImageMessage) {
                Context context2 = view.getContext();
                Object[] objArr3 = {context2};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3f43eae1167584ec4d47c35045c3ba68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3f43eae1167584ec4d47c35045c3ba68");
                } else {
                    Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_1baqv85g_mc", f.a(context2), "c_group_hjkzttqg");
                }
            } else if (bVar.a() instanceof AudioMessage) {
                Context context3 = view.getContext();
                Object[] objArr4 = {context3};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "7d34cdd9ee371977f4d2a948200f87b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "7d34cdd9ee371977f4d2a948200f87b3");
                } else {
                    Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_p58z1cpa_mc", f.a(context3), "c_group_hjkzttqg");
                }
            }
        }
        return super.onClick(view, bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
    public final int getBackgroundResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edead45bdb4f88f7c82183f94d83175", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edead45bdb4f88f7c82183f94d83175")).intValue();
        }
        int a2 = MsgViewType.a(bVar.a());
        if (a2 != 0 && a2 != 1 && !(bVar.a() instanceof UNKnownMessage)) {
            if (a2 == 16) {
                return 0;
            }
            return super.getBackgroundResource(bVar);
        } else if (bVar.f() == 1) {
            return R.drawable.ptim_chat_left_bg;
        } else {
            if (bVar.f() == 2) {
                return R.drawable.ptim_chat_right_bg;
            }
            return 0;
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public final int getTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c9a7b30ba7b07bb488e4f48dff46351", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c9a7b30ba7b07bb488e4f48dff46351")).intValue();
        }
        if (MsgViewType.a(bVar.a()) == 11) {
            return ColorUtils.parseColor("#59000000", 0);
        }
        return super.getTextColor(bVar);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public final int getLinkColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a2fdb883535cb6c1e54685ca630cf6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a2fdb883535cb6c1e54685ca630cf6")).intValue() : ColorUtils.parseColor("#035DE3", 0);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public final int getDefaultAvatarDrawableResource(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11db6cd0fe1701d819415f6c09894f05", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11db6cd0fe1701d819415f6c09894f05")).intValue() : bVar.f() == 2 ? R.drawable.ptim_pic_avatar_right : R.drawable.pic_avatar;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49044e5d4c52bbd11d24335282a2e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49044e5d4c52bbd11d24335282a2e8e");
            return;
        }
        super.release();
        this.b.a();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public final boolean onTextLinkClick(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e15fb21715de5aeda528451cdaf3fb5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e15fb21715de5aeda528451cdaf3fb5f")).booleanValue();
        }
        if (view != null && (view.getTag() instanceof b)) {
            try {
                b bVar = (b) view.getTag();
                if ((bVar.a() instanceof EventMessage) && (view instanceof LinkTextView)) {
                    CharSequence text = ((LinkTextView) view).getText();
                    if (text instanceof Spannable) {
                        Spannable spannable = (Spannable) text;
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
                        if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                            for (ClickableSpan clickableSpan : clickableSpanArr) {
                                if ((clickableSpan instanceof URLSpan) && TextUtils.equals(((URLSpan) clickableSpan).getURL(), str)) {
                                    String charSequence = text.subSequence(spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan)).toString();
                                    Context context = view.getContext();
                                    String text2 = ((EventMessage) bVar.a()).getText();
                                    Object[] objArr2 = {context, text2, charSequence};
                                    ChangeQuickRedirect changeQuickRedirect2 = f.a;
                                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a26313e80df04fe332f7a5d11d2a4edb", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a26313e80df04fe332f7a5d11d2a4edb");
                                    } else {
                                        Map<String, Object> a2 = f.a(context);
                                        a2.put("item_title", text2);
                                        a2.put("button_name", charSequence);
                                        Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_ooeqh8a7_mc", a2, "c_group_hjkzttqg");
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter
    public final void a(View view, final b bVar, Map<Integer, String> map) {
        boolean z;
        Object[] objArr = {view, bVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a53958d1734c49d5668bbae9c87baa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a53958d1734c49d5668bbae9c87baa");
        } else if (bVar.a().getMsgType() == 1) {
            final e eVar = this.b;
            Object[] objArr2 = {view, bVar, this};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "f84224f252df794556870737f2cb81e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "f84224f252df794556870737f2cb81e0");
                return;
            }
            final Context context = view.getContext();
            View findViewById = view.findViewById(R.id.xm_sdk_rl_chatmsg_content);
            if (findViewById == null || context == null) {
                return;
            }
            eVar.a();
            Object[] objArr3 = {findViewById};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "09ba9a077ff786989eb8a13cead615f5", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "09ba9a077ff786989eb8a13cead615f5")).booleanValue();
            } else {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                z = iArr[1] > ((e.a(findViewById.getContext(), 48.0f) + e.a(findViewById.getContext(), 48.0f)) + e.a(findViewById.getContext(), 42.0f)) + e.a(findViewById.getContext(), 3.0f);
            }
            View inflate = LayoutInflater.from(view.getContext()).inflate(z ? R.layout.ptim_text_pop_up : R.layout.ptim_text_pop_down, (ViewGroup) null);
            inflate.measure(0, 0);
            eVar.b = new PopupWindow(inflate, -2, -2);
            eVar.b.getContentView().measure(e.a(eVar.b.getWidth()), e.a(eVar.b.getHeight()));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.pageadapter.message.utils.e.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7efc1c9099765b1a201baf90e30b278f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7efc1c9099765b1a201baf90e30b278f");
                        return;
                    }
                    Context context2 = context;
                    Object[] objArr5 = {context2, "复制"};
                    ChangeQuickRedirect changeQuickRedirect5 = f.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "b2c8db65e14311fa0ba3280ff7261267", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "b2c8db65e14311fa0ba3280ff7261267");
                    } else {
                        Map<String, Object> a2 = f.a(context2);
                        a2.put("button_name", "复制");
                        Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_z0omtkio_mc", a2, "c_group_hjkzttqg");
                    }
                    if (bVar.a() instanceof TextMessage) {
                        k.a(context, ((TextMessage) bVar.a()).getText());
                    }
                    p.b(e.this.b);
                }
            });
            eVar.b.setTouchable(true);
            eVar.b.setFocusable(true);
            eVar.b.setOutsideTouchable(true);
            int measuredWidth = (findViewById.getMeasuredWidth() / 2) - (eVar.b.getContentView().getMeasuredWidth() / 2);
            int measuredHeight = ((-findViewById.getMeasuredHeight()) - eVar.b.getContentView().getMeasuredHeight()) - e.a(context, 3.0f);
            if (!z) {
                measuredHeight = e.a(context, 3.0f);
            }
            PopupWindowCompat.showAsDropDown(eVar.b, findViewById, measuredWidth, measuredHeight, GravityCompat.START);
            f.a(context, "复制");
        }
    }

    public void a(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37339e7d8763811dfec0a31e463dfde6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37339e7d8763811dfec0a31e463dfde6");
        } else {
            super.onAvatarClick(view, bVar);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public final void onAvatarClick(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e752a2ec5def321df58fd0d46aa54c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e752a2ec5def321df58fd0d46aa54c4");
            return;
        }
        try {
            String packageName = view.getContext().getPackageName();
            if (bVar.f() == 2 && "com.sankuai.meituan".equals(packageName)) {
                d.a(view.getContext(), "imeituan://www.meituan.com/web?url=https%3A%2F%2Fmtaccount.meituan.com%2Fuser%2Fperson-info");
            } else {
                a(view, bVar);
            }
            Context context = view.getContext();
            String str = bVar.f() == 2 ? "0" : "1";
            Object[] objArr2 = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4744d34c34ac2059d9ae6a8b1a80f695", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4744d34c34ac2059d9ae6a8b1a80f695");
                return;
            }
            Map<String, Object> a2 = f.a(context);
            a2.put("user_type", str);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap(a2);
            hashMap2.put("bid", "b_group_k43icutm_mc");
            hashMap.put("c_group_hjkzttqg", hashMap2);
            Statistics.getChannel("group").updateTag("group", hashMap);
            Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_k43icutm_mc", a2, "c_group_hjkzttqg");
        } catch (Throwable unused) {
            a(view, bVar);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStatusAdapter
    public void onMsgFailTipClick(View view, b bVar) {
        MsgAddition j;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d4444f56446ccd0992ac3e1e3b3a15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d4444f56446ccd0992ac3e1e3b3a15");
            return;
        }
        if (bVar != null && (j = bVar.j()) != null) {
            try {
                if (JsonHelper.getBoolean((JsonObject) JsonHelper.fromJson(j.getAdditionData(), JsonObject.class), "platformAddition/hitRisk", false)) {
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        super.onMsgFailTipClick(view, bVar);
        SessionFragment a2 = com.sankuai.xm.imui.session.b.a(view.getContext());
        if (a2 != null) {
            new Handler(Looper.getMainLooper()).postDelayed(a.a(a2), 500L);
        }
    }

    public static /* synthetic */ void a(SessionFragment sessionFragment) {
        Object[] objArr = {sessionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e9c394cbff737c9d62965623c3fd012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e9c394cbff737c9d62965623c3fd012");
        } else {
            sessionFragment.A();
        }
    }
}
