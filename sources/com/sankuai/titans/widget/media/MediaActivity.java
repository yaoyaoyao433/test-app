package com.sankuai.titans.widget.media;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.titans.widget.PlayerBuilder;
import com.sankuai.titans.widget.SnackbarUtil;
import com.sankuai.titans.widget.media.entity.Photo;
import com.sankuai.titans.widget.media.event.OnItemCheckListener;
import com.sankuai.titans.widget.media.fragment.MediaPickerFragment;
import com.sankuai.titans.widget.media.fragment.MediaPlayerFragment;
import com.sankuai.waimai.platform.utils.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MediaActivity extends AppCompatActivity {
    public static final String KEY_ACCESS_TOKEN = "ACCESS_TOKEN";
    private static final int REQUESTCODE = 111;
    private static final String TAG = "MediaActivity";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ActionBar actionBar;
    private int maxCount;
    private MenuItem menuDoneItem;
    private boolean menuIsInflated;
    private ArrayList<String> originalPhotos;
    private int outputMediaSize;
    private MediaPickerFragment pickerFragment;
    private MediaPlayerFragment playerFragment;
    private boolean showAnimate;

    public MediaActivity getActivity() {
        return this;
    }

    public MediaActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebd0d2a91cd5d02da1aa52a9401bac3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebd0d2a91cd5d02da1aa52a9401bac3a");
            return;
        }
        this.maxCount = 9;
        this.menuIsInflated = false;
        this.originalPhotos = null;
        this.showAnimate = true;
        this.outputMediaSize = 1;
    }

    private int getMediaSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "793d85a6d45fff83e0493958d7f2228a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "793d85a6d45fff83e0493958d7f2228a")).intValue();
        }
        View findViewById = findViewById(R.id.fullSize);
        if (findViewById != null) {
            return findViewById.isSelected() ? 0 : 1;
        }
        return this.outputMediaSize;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69ca079937ad23ceaac1d76a941f0ff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69ca079937ad23ceaac1d76a941f0ff6");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.titans_media_activity);
        boolean isPreviewAction = isPreviewAction();
        boolean hasLocalPath = hasLocalPath();
        String a = f.a(getIntent(), KEY_ACCESS_TOKEN);
        String str = null;
        if (!isPreviewAction || hasLocalPath) {
            str = PermissionGuard.PERMISSION_STORAGE_READ;
        }
        if (!TextUtils.isEmpty(str)) {
            TitansPermissionUtil.requestPermission(this, str, a, new IRequestPermissionCallback() { // from class: com.sankuai.titans.widget.media.MediaActivity.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "71d50dcdb59226a58b2ec2d55db3e8f8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "71d50dcdb59226a58b2ec2d55db3e8f8");
                    } else if (z) {
                        MediaActivity.this.loadFragment();
                    } else {
                        MediaActivity.this.finishResultWithoutPermission();
                    }
                }
            });
        } else {
            loadFragment();
        }
    }

    private boolean isPreviewAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "868c88cd2039f1112f7ecd7f6325724b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "868c88cd2039f1112f7ecd7f6325724b")).booleanValue();
        }
        String action = getIntent().getAction();
        return TextUtils.equals(action, MediaWidget.ACTION_PLAYER) || TextUtils.equals(action, MediaWidget.ACTION_PLAYER_OLD);
    }

    private boolean hasLocalPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6ebc855b28254c33056775a26a57171", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6ebc855b28254c33056775a26a57171")).booleanValue();
        }
        ArrayList<String> b = f.b(getIntent(), PlayerBuilder.KEY_ASSETS);
        if (b != null && !b.isEmpty()) {
            for (String str : b) {
                if (!TextUtils.isEmpty(str) && !URLUtil.isNetworkUrl(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35bd1e342b71ba62fa78b280c0fca328", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35bd1e342b71ba62fa78b280c0fca328");
        } else if (isPreviewAction()) {
            initPreviewFragment();
        } else {
            initPickerFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishResultWithoutPermission() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2907f622f0b5262905bb5cec4ec855fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2907f622f0b5262905bb5cec4ec855fe");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS, new ArrayList<>());
        invokeFinishCallback(-1, bundle);
    }

    private void initPreviewFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10d744804b4449995d1f58fe92e5a0c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10d744804b4449995d1f58fe92e5a0c7");
            return;
        }
        getWindow().setFlags(1024, 1024);
        ArrayList<String> b = f.b(getIntent(), PlayerBuilder.KEY_ASSETS);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = (ArrayList) f.c(getIntent(), PlayerBuilder.KEY_HEADERS);
        if (b != null && arrayList != null) {
            for (int i = 0; i < b.size() && i < arrayList.size(); i++) {
                HashMap hashMap2 = (HashMap) arrayList.get(i);
                if (hashMap2 != null) {
                    hashMap.put(b.get(i), hashMap2);
                }
            }
        }
        MediaPlayerFragment mediaPlayerFragment = (MediaPlayerFragment) getSupportFragmentManager().findFragmentByTag("view_play");
        if (mediaPlayerFragment == null) {
            mediaPlayerFragment = MediaPlayerFragment.activityNewInstance(getIntent().getExtras(), hashMap);
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mediaPlayerFragment, "view_play").commitAllowingStateLoss();
            try {
                getSupportFragmentManager().executePendingTransactions();
            } catch (Exception unused) {
            }
        }
        this.showAnimate = f.a(getIntent(), PlayerBuilder.KEY_SHOW_ANIMATE, this.showAnimate);
        this.actionBar = getSupportActionBar();
        if (this.actionBar != null) {
            this.actionBar.a(true);
            if (Build.VERSION.SDK_INT >= 21) {
                this.actionBar.a(25.0f);
            }
        }
        mediaPlayerFragment.setOnPageChangeListener(new MediaPlayerFragment.OnPageChangeListener() { // from class: com.sankuai.titans.widget.media.MediaActivity.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.widget.media.fragment.MediaPlayerFragment.OnPageChangeListener
            public void onPageChanged(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c0befe8db36d5b9b7c07b79ebf6e2f29", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c0befe8db36d5b9b7c07b79ebf6e2f29");
                } else {
                    MediaActivity.this.updateActionBarTitle(i2, i3);
                }
            }
        });
    }

    public void updateActionBarTitle(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f18e8462ec455d154b202b89306312f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f18e8462ec455d154b202b89306312f");
        } else if (this.actionBar != null) {
            this.actionBar.a(getString(R.string.__picker_image_index, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}));
        }
    }

    private void initPickerFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "064b2d4711492b838982e5cfeb1a9699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "064b2d4711492b838982e5cfeb1a9699");
            return;
        }
        boolean a = f.a(getIntent(), PickerBuilder.EXTRA_SHOW_ALL, false);
        boolean a2 = f.a(getIntent(), PickerBuilder.EXTRA_SHOW_VIDEO_ONLY, false);
        ViewStub viewStub = (ViewStub) findViewById(R.id.stub_toolbar);
        if (viewStub != null) {
            Toolbar toolbar = (Toolbar) viewStub.inflate().findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.MediaActivity.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dfabc92d54b748d09ea744dbd798cf8c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dfabc92d54b748d09ea744dbd798cf8c");
                    } else {
                        MediaActivity.this.onBackPressed();
                    }
                }
            });
        }
        if (a) {
            setTitle(R.string.__picker_all_image_and_video);
        } else if (a2) {
            setTitle(R.string.__picker_title_video);
        } else {
            setTitle(R.string.__picker_title);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.a(true);
            if (Build.VERSION.SDK_INT >= 21) {
                supportActionBar.a(25.0f);
            }
        }
        if (a || !a2) {
            this.maxCount = f.a(getIntent(), PickerBuilder.EXTRA_MAX_COUNT, 9);
        } else {
            this.maxCount = 1;
        }
        this.originalPhotos = f.b(getIntent(), PickerBuilder.EXTRA_CHOSEN_ASSET_IDS);
        this.pickerFragment = (MediaPickerFragment) getSupportFragmentManager().findFragmentByTag("view_pick");
        if (this.pickerFragment == null) {
            if (getIntent() == null || getIntent().getExtras() == null) {
                Toast.makeText(this, getString(R.string.__picker_unknown_error), 0).show();
                finishResultWithoutPermission();
                return;
            }
            this.pickerFragment = MediaPickerFragment.newInstance(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().replace(R.id.container, this.pickerFragment, "view_pick").commitAllowingStateLoss();
            try {
                getSupportFragmentManager().executePendingTransactions();
            } catch (Exception unused) {
            }
        }
        this.pickerFragment.setOnItemCheckListener(new OnItemCheckListener() { // from class: com.sankuai.titans.widget.media.MediaActivity.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.widget.media.event.OnItemCheckListener
            public boolean onItemCheck(int i, Photo photo, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), photo, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aff749e39e8ac0eb7e0dc25f1d44a654", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aff749e39e8ac0eb7e0dc25f1d44a654")).booleanValue();
                }
                MediaActivity.this.menuDoneItem.setEnabled(i2 > 0);
                if (MediaActivity.this.maxCount <= 1) {
                    List<String> selectedPhotos = MediaActivity.this.pickerFragment.getPhotoGridAdapter().getSelectedPhotos();
                    if (!selectedPhotos.contains(photo.getPath())) {
                        selectedPhotos.clear();
                        MediaActivity.this.pickerFragment.getPhotoGridAdapter().notifyDataSetChanged();
                    }
                    return true;
                } else if (i2 <= MediaActivity.this.maxCount) {
                    MediaActivity.this.menuDoneItem.setTitle(MediaActivity.this.getString(R.string.__picker_done_with_count, new Object[]{Integer.valueOf(i2), Integer.valueOf(MediaActivity.this.maxCount)}));
                    return true;
                } else {
                    String a3 = f.a(MediaActivity.this.getIntent(), PickerBuilder.EXTRA_MAX_COUNT_HINT);
                    SnackbarUtil.showSnackbar(MediaActivity.this.getActivity(), (TextUtils.isEmpty(a3) || !a3.contains("%d")) ? MediaActivity.this.getString(R.string.__picker_over_max_count_tips, new Object[]{Integer.valueOf(MediaActivity.this.maxCount)}) : String.format(a3, Integer.valueOf(MediaActivity.this.maxCount)));
                    return false;
                }
            }
        });
    }

    public void updateTitleDoneItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36f3c10424c0439344b5963203054366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36f3c10424c0439344b5963203054366");
        } else if (this.menuIsInflated) {
            if (this.pickerFragment != null && this.pickerFragment.isResumed()) {
                List<String> selectedPhotos = this.pickerFragment.getPhotoGridAdapter().getSelectedPhotos();
                int size = selectedPhotos == null ? 0 : selectedPhotos.size();
                this.menuDoneItem.setEnabled(size > 0);
                if (this.maxCount > 1) {
                    this.menuDoneItem.setTitle(getString(R.string.__picker_done_with_count, new Object[]{Integer.valueOf(size), Integer.valueOf(this.maxCount)}));
                } else {
                    this.menuDoneItem.setTitle(getString(R.string.__picker_done));
                }
            } else if (this.playerFragment == null || !this.playerFragment.isResumed()) {
            } else {
                this.menuDoneItem.setEnabled(true);
            }
        }
    }

    public void updateOutputMediaSize(int i) {
        this.outputMediaSize = i;
    }

    public void resumeViewData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd6f843b306cdd413ac1f889f55c9b13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd6f843b306cdd413ac1f889f55c9b13");
            return;
        }
        View findViewById = findViewById(R.id.fullSize);
        if (findViewById != null) {
            findViewById.setSelected(this.outputMediaSize == 0);
        }
    }

    public void addImagePagerFragment(MediaPlayerFragment mediaPlayerFragment) {
        Object[] objArr = {mediaPlayerFragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85ad1f153bcfe7c81d23d656344c48e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85ad1f153bcfe7c81d23d656344c48e7");
            return;
        }
        this.outputMediaSize = getMediaSize();
        this.playerFragment = mediaPlayerFragment;
        getSupportFragmentManager().beginTransaction().replace(R.id.container, this.playerFragment).addToBackStack(null).commitAllowingStateLoss();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Object[] objArr = {menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2991ef1d706a7cd3b640f9cbe8e33a42", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2991ef1d706a7cd3b640f9cbe8e33a42")).booleanValue();
        }
        if (this.menuIsInflated) {
            return false;
        }
        getMenuInflater().inflate(R.menu.__picker_menu_picker, menu);
        this.menuDoneItem = menu.findItem(R.id.done);
        if (this.originalPhotos != null && this.originalPhotos.size() > 0) {
            this.menuDoneItem.setEnabled(true);
            this.menuDoneItem.setTitle(getString(R.string.__picker_done_with_count, new Object[]{Integer.valueOf(this.originalPhotos.size()), Integer.valueOf(this.maxCount)}));
        } else {
            this.menuDoneItem.setEnabled(false);
        }
        this.menuIsInflated = true;
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7d7ba7c583ecee8fa0431db854231b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7d7ba7c583ecee8fa0431db854231b2")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            super.onBackPressed();
            return true;
        } else if (menuItem.getItemId() == R.id.done) {
            Bundle bundle = new Bundle();
            ArrayList<String> selectedPhotoPaths = this.pickerFragment != null ? this.pickerFragment.getPhotoGridAdapter().getSelectedPhotoPaths() : null;
            if (selectedPhotoPaths.size() <= 0 && this.playerFragment != null && this.playerFragment.isResumed()) {
                selectedPhotoPaths = this.playerFragment.getCurrentPath();
            }
            if (selectedPhotoPaths != null && selectedPhotoPaths.size() > 0) {
                bundle.putStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS, selectedPhotoPaths);
                invokeFinishCallback(-1, bundle);
            }
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7380ae8ab244e27142af2c9be1358455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7380ae8ab244e27142af2c9be1358455");
        } else if (this.playerFragment != null && this.playerFragment.isVisible()) {
            if (getSupportFragmentManager().getBackStackEntryCount() <= 0 || getSupportFragmentManager().isStateSaved()) {
                return;
            }
            getSupportFragmentManager().popBackStack();
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS, new ArrayList<>());
            invokeFinishCallback(0, bundle);
        }
    }

    public void invokeFinishCallback(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19de350fe369f3765e0b282cbc58d07e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19de350fe369f3765e0b282cbc58d07e");
            return;
        }
        try {
            bundle.putInt(PickerBuilder.OUTPUT_MEDIA_SIZE, getMediaSize());
            Intent intent = new Intent();
            intent.putExtras(bundle);
            setResult(i, intent);
            finish();
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "310d6e39a3089e691986cf9ffc08a67a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "310d6e39a3089e691986cf9ffc08a67a");
            return;
        }
        super.finish();
        if (this.showAnimate) {
            return;
        }
        overridePendingTransition(-1, -1);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Bundle bundle2;
        ClassLoader classLoader;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e331cd4c081edfd808571f1630944dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e331cd4c081edfd808571f1630944dab");
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (bundle2 = bundle.getBundle("android:viewHierarchyState")) != null && ((classLoader = bundle2.getClassLoader()) == null || classLoader.getClass().getSimpleName().equals("BootClassLoader"))) {
            bundle2.setClassLoader(getApplicationContext().getClassLoader());
        }
        super.onRestoreInstanceState(bundle);
    }
}
