package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.imui.common.util.e;
import com.sankuai.xm.imui.common.util.j;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IFileMsgAdapter;
import com.sankuai.xm.video.RoundProgressBar;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class FileMsgView extends MediaMsgView<FileMessage, IFileMsgAdapter> {
    public static ChangeQuickRedirect a;
    private TextView t;
    private TextView u;
    private View v;
    private RoundProgressBar w;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_chat_file_msg;
    }

    public FileMsgView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d774618f4e0b0b3463526e2816353742", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d774618f4e0b0b3463526e2816353742");
        }
    }

    public FileMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce07b02d18ed5214d609853c3dee631c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce07b02d18ed5214d609853c3dee631c");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<FileMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479fdb09d52c60fdc6a582303a6fb5dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479fdb09d52c60fdc6a582303a6fb5dc");
            return;
        }
        this.t = (TextView) view.findViewById(R.id.xm_sdk_tv_chat_file_name);
        this.u = (TextView) view.findViewById(R.id.xm_sdk_tv_chat_file_size);
        this.v = view.findViewById(R.id.xm_sdk_iv_chat_file_pic);
        this.w = (RoundProgressBar) view.findViewById(R.id.xm_sdk_msg_progress);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31ca7d26d2748c9b40f4fdca7d8ca1dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31ca7d26d2748c9b40f4fdca7d8ca1dd");
        } else {
            a(getContext(), (FileMessage) this.n.b);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(b<FileMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "714c55116e7c4d446bcaba42db79f28b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "714c55116e7c4d446bcaba42db79f28b");
            return;
        }
        super.a(bVar);
        String name = bVar.b.getName();
        this.t.setTag(name);
        if (bVar.f > 0) {
            b(bVar.f);
        } else {
            this.u.setText(k.a(bVar.b.getSize()));
        }
        if (name != null && name.length() > 15) {
            String substring = name.substring(name.length() - 7);
            CharSequence ellipsize = TextUtils.ellipsize(name.substring(0, name.length() - 7), this.t.getPaint(), (this.t.getMaxWidth() * 1.5f) - this.t.getPaint().measureText(substring), TextUtils.TruncateAt.END);
            name = ((Object) ellipsize) + substring;
        }
        this.v.getBackground().setLevel(0);
        this.t.setText(name);
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e9d844921d143f979c937ec00fd15e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e9d844921d143f979c937ec00fd15e");
            return;
        }
        super.a(i);
        if (((FileMessage) this.n.b).getFileStatus() == 3) {
            b(100);
        }
    }

    @Override // com.sankuai.xm.imui.session.view.MediaMsgView
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c8f1a6c49d2f7eecb959933ac0b380", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c8f1a6c49d2f7eecb959933ac0b380");
            return;
        }
        super.b(i);
        if (this.n != null) {
            String a2 = com.sankuai.xm.base.util.k.a(((FileMessage) this.n.b).getSize());
            if (i < 100) {
                this.w.setVisibility(0);
                this.w.setProgress(i);
                String str = com.sankuai.xm.base.util.k.a((((FileMessage) this.n.b).getSize() * i) / 100) + "/" + a2;
                if (((FileMessage) this.n.b).getFileStatus() == 2) {
                    str = getResources().getString(R.string.xm_sdk_msg_uploading) + StringUtil.SPACE + str;
                } else if (((FileMessage) this.n.b).getFileStatus() == 6) {
                    str = getResources().getString(R.string.xm_sdk_msg_downloading) + StringUtil.SPACE + str;
                }
                a2 = str;
                this.v.getBackground().setLevel(1);
            } else {
                this.w.setVisibility(8);
                this.v.getBackground().setLevel(0);
            }
            this.u.setText(a2);
        }
    }

    public static void a(Context context, FileMessage fileMessage) {
        Object[] objArr = {context, fileMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd7b890d6bd2e82442da5746dabd2c27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd7b890d6bd2e82442da5746dabd2c27");
            return;
        }
        boolean a2 = e.a(fileMessage);
        String url = fileMessage.getUrl();
        String f = com.sankuai.xm.base.util.k.f(IMClient.a().b(8), com.sankuai.xm.base.util.k.c(url));
        if (a2 && !com.sankuai.xm.base.util.k.o(f)) {
            IMClient.a().a(fileMessage, url, f, 3);
        }
        j.a(context, fileMessage.getPath(), a2, fileMessage.getName(), fileMessage.getSize(), fileMessage.getUrl(), fileMessage.getToken());
    }
}
