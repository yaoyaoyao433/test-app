package com.dianping.picasso;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.rx.PicassoObservable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import rx.android.schedulers.a;
import rx.d;
import rx.exceptions.b;
import rx.functions.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoInput implements Parcelable {
    public static final Parcelable.Creator<PicassoInput> CREATOR = new Parcelable.Creator<PicassoInput>() { // from class: com.dianping.picasso.PicassoInput.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PicassoInput createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14b282a5a190df69319f3525a22e68cf", RobustBitConfig.DEFAULT_VALUE) ? (PicassoInput) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14b282a5a190df69319f3525a22e68cf") : new PicassoInput();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PicassoInput[] newArray(int i) {
            return new PicassoInput[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public Throwable computeError;
    private int executorIdx;
    public int height;
    public boolean isComputeSuccess;
    public String jsonData;
    protected String lastLayoutString;
    public String layoutString;
    public String name;
    protected JSONObject userDefined;
    public PicassoModel viewModel;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public PicassoInput() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d37ab1de958bc7238126fba444eecbc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d37ab1de958bc7238126fba444eecbc8");
            return;
        }
        this.executorIdx = -1;
        this.userDefined = null;
    }

    public void setDefinedContext(JSONObject jSONObject) {
        this.userDefined = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d<PicassoInput> computePicassoModelLooper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71fe4a89003eeaa837474b42f5e36f2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71fe4a89003eeaa837474b42f5e36f2c");
        }
        this.isComputeSuccess = false;
        this.computeError = null;
        if (TextUtils.isEmpty(this.layoutString)) {
            return d.a((d.a) new d.a<PicassoInput>() { // from class: com.dianping.picasso.PicassoInput.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public void call(j<? super PicassoInput> jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f5a2dbc673f6e5168784424e7f86c0a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f5a2dbc673f6e5168784424e7f86c0a3");
                        return;
                    }
                    Exception exc = new Exception("Js content is null");
                    PicassoInput.this.isComputeSuccess = false;
                    PicassoInput.this.computeError = exc;
                    jVar.onError(exc);
                }
            });
        }
        if (this.executorIdx < 0) {
            this.executorIdx = ParsingJSHelper.getInstance(context).getJSExecutor().count();
        }
        return ParsingJSHelper.getInstance(context).getJSExecutor().exec(this, this.name, this.executorIdx).d(new g<Value, PicassoInput>() { // from class: com.dianping.picasso.PicassoInput.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.g
            public PicassoInput call(Value value) {
                Object[] objArr2 = {value};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "533e19405d49415596d78f7525a38079", RobustBitConfig.DEFAULT_VALUE)) {
                    return (PicassoInput) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "533e19405d49415596d78f7525a38079");
                }
                try {
                    PicassoInput.this.viewModel = (PicassoModel) value.object(PicassoModel.PICASSO_DECODER);
                    PicassoInput.this.isComputeSuccess = true;
                    PicassoInput.this.computeError = null;
                    return PicassoInput.this;
                } catch (ArchiveException e) {
                    throw b.a(e);
                }
            }
        });
    }

    public PicassoObservable<PicassoInput> computePicassoInput(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2b34431799ed478838e1392470f407c", RobustBitConfig.DEFAULT_VALUE) ? (PicassoObservable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2b34431799ed478838e1392470f407c") : PicassoObservable.createObservable(computePicassoModelLooper(context).a(a.a()));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.picasso.PicassoInput$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 implements d.a<List<PicassoInput>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ PicassoInput[] val$picassoInputs;

        public AnonymousClass4(PicassoInput[] picassoInputArr, Context context) {
            this.val$picassoInputs = picassoInputArr;
            this.val$context = context;
        }

        @Override // rx.functions.b
        public final void call(final j<? super List<PicassoInput>> jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "904a14dd4236a46f1a4c61cc2e53e563", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "904a14dd4236a46f1a4c61cc2e53e563");
            } else {
                d.a(new j<PicassoInput>() { // from class: com.dianping.picasso.PicassoInput.4.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // rx.e
                    public void onNext(PicassoInput picassoInput) {
                    }

                    @Override // rx.e
                    public void onCompleted() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6e3f8e0e0c5f4b66039d36d50af11453", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6e3f8e0e0c5f4b66039d36d50af11453");
                        } else {
                            jVar.onNext(Arrays.asList(AnonymousClass4.this.val$picassoInputs));
                        }
                    }

                    @Override // rx.e
                    public void onError(Throwable th) {
                        Object[] objArr2 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7cdc154c98196667502429d35d4cfb5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7cdc154c98196667502429d35d4cfb5");
                        } else {
                            jVar.onError(th);
                        }
                    }
                }, d.a((Object[]) this.val$picassoInputs).c(new g<PicassoInput, d<PicassoInput>>() { // from class: com.dianping.picasso.PicassoInput.4.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // rx.functions.g
                    public d<PicassoInput> call(final PicassoInput picassoInput) {
                        Object[] objArr2 = {picassoInput};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b82213f631d9b4fd707a2a80c0754ade", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b82213f631d9b4fd707a2a80c0754ade") : d.a((d.a) new d.a<PicassoInput>() { // from class: com.dianping.picasso.PicassoInput.4.2.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // rx.functions.b
                            public void call(final j<? super PicassoInput> jVar2) {
                                Object[] objArr3 = {jVar2};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3451176bb7b41b9078d560c05fe64291", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3451176bb7b41b9078d560c05fe64291");
                                } else {
                                    d.a(new j<PicassoInput>() { // from class: com.dianping.picasso.PicassoInput.4.2.1.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        @Override // rx.e
                                        public void onCompleted() {
                                        }

                                        @Override // rx.e
                                        public void onError(Throwable th) {
                                            Object[] objArr4 = {th};
                                            ChangeQuickRedirect changeQuickRedirect5 = changeQuickRedirect;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "72213ca71243633d5463761893106402", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "72213ca71243633d5463761893106402");
                                                return;
                                            }
                                            picassoInput.isComputeSuccess = false;
                                            picassoInput.computeError = th;
                                            jVar2.onNext(null);
                                            jVar2.onCompleted();
                                        }

                                        @Override // rx.e
                                        public void onNext(PicassoInput picassoInput2) {
                                            Object[] objArr4 = {picassoInput2};
                                            ChangeQuickRedirect changeQuickRedirect5 = changeQuickRedirect;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "4c13e09248d5af0129d7540b55a535f2", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "4c13e09248d5af0129d7540b55a535f2");
                                                return;
                                            }
                                            jVar2.onNext(picassoInput2);
                                            jVar2.onCompleted();
                                        }
                                    }, picassoInput.computePicassoModelLooper(AnonymousClass4.this.val$context));
                                }
                            }
                        });
                    }
                }));
            }
        }
    }

    public static PicassoObservable<List<PicassoInput>> computePicassoInputList(Context context, PicassoInput[] picassoInputArr) {
        Object[] objArr = {context, picassoInputArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88bf1a420bc5eca59125e3365341b97e", RobustBitConfig.DEFAULT_VALUE) ? (PicassoObservable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88bf1a420bc5eca59125e3365341b97e") : PicassoObservable.createObservable(d.a((d.a) new AnonymousClass4(picassoInputArr, context)).a(a.a()));
    }
}
