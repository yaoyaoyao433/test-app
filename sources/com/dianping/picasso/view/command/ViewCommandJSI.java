package com.dianping.picasso.view.command;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.dianping.codelog.b;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picassocontroller.jse.h;
import com.dianping.picassocontroller.vc.c;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ViewCommandJSI extends JavaScriptInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.jscore.JavaScriptInterface
    public Value exec(Value[] valueArr) {
        Object[] objArr = {valueArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51c354d1a117e923fec0639778ab7c6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51c354d1a117e923fec0639778ab7c6c");
        }
        BaseViewCommandModel[] baseViewCommandModelArr = null;
        try {
            String string = valueArr[0].string();
            String[] readStringArray = valueArr[1].getUnarchived().readStringArray();
            CommandValue commandValue = new CommandValue(valueArr[2]);
            if (!TextUtils.isEmpty(string) && readStringArray != null && readStringArray.length != 0) {
                PicassoModel[] picassoModelArr = new PicassoModel[readStringArray.length];
                DecodingFactory[] decodingFactoryArr = new DecodingFactory[readStringArray.length];
                g gVar = (g) c.a(string);
                if (gVar == null) {
                    b.a(ViewCommandJSI.class, "host is not found, hostId is " + string);
                    return new Value();
                }
                for (int i = 0; i < readStringArray.length; i++) {
                    String str = readStringArray[i];
                    PicassoModel b = gVar.b(str);
                    picassoModelArr[i] = b;
                    if (b == null) {
                        b.a(ViewCommandJSI.class, "picassoModel is null, viewId is " + str);
                        return new Value();
                    }
                    decodingFactoryArr[i] = getDecodingFactory(b.type);
                }
                try {
                    baseViewCommandModelArr = commandValue.array(decodingFactoryArr);
                } catch (ArchiveException e) {
                    b.b(ViewCommandJSI.class, "propsUnarchived is null ");
                    e.printStackTrace();
                }
                commandView(gVar, readStringArray, baseViewCommandModelArr, picassoModelArr);
                return new Value();
            }
            b.a(ViewCommandJSI.class, "host or tags  may be null!!!");
            return new Value();
        } catch (Exception e2) {
            e2.printStackTrace();
            return new Value();
        }
    }

    private void commandView(@NonNull final g gVar, @NonNull final String[] strArr, @NonNull final BaseViewCommandModel[] baseViewCommandModelArr, final PicassoModel[] picassoModelArr) {
        Object[] objArr = {gVar, strArr, baseViewCommandModelArr, picassoModelArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2713f28fd6f673ad2e14b4410d2e601e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2713f28fd6f673ad2e14b4410d2e601e");
        } else if (baseViewCommandModelArr == null || picassoModelArr == null || baseViewCommandModelArr.length != picassoModelArr.length) {
        } else {
            h.b(gVar, new Runnable() { // from class: com.dianping.picasso.view.command.ViewCommandJSI.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "460844bcc62dc838d121386b50a23bdd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "460844bcc62dc838d121386b50a23bdd");
                        return;
                    }
                    for (int i = 0; i < strArr.length; i++) {
                        BaseViewCommandModel baseViewCommandModel = baseViewCommandModelArr[i];
                        PicassoModel picassoModel = picassoModelArr[i];
                        View a = gVar.a(strArr[i]);
                        if (baseViewCommandModel != null && picassoModel != null) {
                            ViewCommandJSI.this.handleViewCommand(picassoModel.type, a, baseViewCommandModel, picassoModel);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleViewCommand(int i, View view, BaseViewCommandModel baseViewCommandModel, PicassoModel picassoModel) {
        Object[] objArr = {Integer.valueOf(i), view, baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d87987bd198b839405fd7bb72fd238ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d87987bd198b839405fd7bb72fd238ca");
        } else if (baseViewCommandModel == null || picassoModel == null) {
        } else {
            BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(i));
            if (viewWrapperByType instanceof CommandViewInterface) {
                viewWrapperByType.handleCommandView(view, baseViewCommandModel, picassoModel);
            }
        }
    }

    private DecodingFactory getDecodingFactory(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59ca39c753f1685366e1f24190bdb71d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DecodingFactory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59ca39c753f1685366e1f24190bdb71d");
        }
        BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(i));
        if (viewWrapperByType instanceof CommandViewInterface) {
            return viewWrapperByType.getCommandViewDecodingFactory();
        }
        b.a(ViewCommandJSI.class, "view is null in getDecodingFactory()");
        return BaseViewCommandModel.PICASSO_DECODER;
    }
}
