package com.example.android.new_nds_study.activity;

import android.Manifest;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.ProvinceandCity;
import com.example.android.new_nds_study.m_v_p.bean.UserUpdate;
import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;
import com.example.android.new_nds_study.m_v_p.presnster.SetPresenter;
import com.example.android.new_nds_study.m_v_p.view.SetPresenterListenner;
import com.example.android.new_nds_study.util.PhotoUtils;
import com.example.android.new_nds_study.util.ToastUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.lljjcoder.Interface.OnCityItemClickListener;
import com.lljjcoder.bean.CityBean;
import com.lljjcoder.bean.DistrictBean;
import com.lljjcoder.bean.ProvinceBean;
import com.lljjcoder.citywheel.CityConfig;
import com.lljjcoder.style.citypickerview.CityPickerView;

import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


public class SetActivity extends AppCompatActivity implements View.OnClickListener,SetPresenterListenner {

    public final static int REQUEST_PICTURE_CHOOSE = 1;
    public final static int  REQUEST_CAMERA_IMAGE = 2;
    public final static int REQUEST_CROP_IMAGE = 3;

    public static File mPictureFile;
    public static Bitmap mImage;
    public static byte[] mImageData;
    private static final int CODE_GALLERY_REQUEST = 0xa0;
    private static final int CODE_CAMERA_REQUEST = 0xa1;
    private static final int CODE_RESULT_REQUEST = 0xa2;
    private static final int CAMERA_PERMISSIONS_REQUEST_CODE = 0x03;
    private static final int STORAGE_PERMISSIONS_REQUEST_CODE = 0x04;
    private File fileUri = new File(Environment.getExternalStorageDirectory().getPath() ,"photo.jpg");
    private File fileCropUri = new File(Environment.getExternalStorageDirectory().getPath() ,"crop_photo.jpg");
    private Uri imageUri;
    private Uri cropImageUri;
    private ImageView mIvSetReturn;
    /**
     * 头像
     */
    private TextView mTextView;
    private SimpleDraweeView mImageView;
    private ImageView mImageView2;
    /**
     * name
     */
    private TextView mTextViewName;
    private ImageView mImageView3;
    /**
     * 吴洋洋
     */
    private TextView mTextView2;
    /**
     * 人脸识别设置
     */
    private TextView mTextViewFace;
    /**
     * 设置成功
     */
    private TextView mTextView3;
    private ImageView mImageView4;
    /**
     * 第三方绑定
     */
    private TextView mTextViewBind;
    private ImageView mImageView5;
    /**
     * 性别
     */
    private TextView mTextView4;
    /**
     * 生日
     */
    private TextView mTextView5;
    /**
     * 地区
     */
    private TextView mTextView6;
    /**
     * 个性标签
     */
    private TextView mTextView7;
    private ImageView mImageView6;
    private ImageView mImageView7;
    private ImageView mImageView8;
    private ImageView mImageView9;
    /**
     * 男
     */
    private TextView mTextView8;
    /**
     * 2000/01/01
     */
    private TextView mTextView9;
    /**
     * 山西—吕梁
     */
    private TextView mTextView10;
    /**
     * 你什么都没说~
     */
    private TextView mTextView11;
    private String token;
    private SetPresenter setPresenter;
    private int mYear;
    private int mMonth;
    private int mDay;
    private String uid;
    private int oid;
    private ProvinceandCity.DataBean data;
    private Map<String,String> city =  new HashMap<>();
    private CityPickerView mPicker;
    private TextView photo_photograph;
    private TextView photo_album;
    private TextView photo_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_set);

        initView();
        initData();

    }

    private void initData() {
        token = MyApp.sp.getString("token", "");

        setPresenter = new SetPresenter(this);

    }

    private void initView() {
        mPicker = new CityPickerView();
        mPicker.init(this);
        CityConfig cityConfig = new CityConfig.Builder().build();
        mPicker.setConfig(cityConfig);

        mIvSetReturn = (ImageView) findViewById(R.id.iv_set_return);
        mIvSetReturn.setOnClickListener(this);
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setOnClickListener(this);
        mImageView = (SimpleDraweeView) findViewById(R.id.imageView);
        mImageView.setOnClickListener(this);
        mImageView2 = (ImageView) findViewById(R.id.imageView2);
        mImageView2.setOnClickListener(this);
        mTextViewName = (TextView) findViewById(R.id.textView_name);
        mTextViewName.setOnClickListener(this);
        mImageView3 = (ImageView) findViewById(R.id.imageView3);
        mImageView3.setOnClickListener(this);
        mTextView2 = (TextView) findViewById(R.id.textView2);
        mTextView2.setOnClickListener(this);
        mTextViewFace = (TextView) findViewById(R.id.textView_face);
        mTextViewFace.setOnClickListener(this);
        mTextView3 = (TextView) findViewById(R.id.textView3);
        mTextView3.setOnClickListener(this);
        mImageView4 = (ImageView) findViewById(R.id.imageView4);
        mImageView4.setOnClickListener(this);
        mTextViewBind = (TextView) findViewById(R.id.textView_bind);
        mTextViewBind.setOnClickListener(this);
        mImageView5 = (ImageView) findViewById(R.id.imageView5);
        mImageView5.setOnClickListener(this);
        mTextView4 = (TextView) findViewById(R.id.textView4);
        mTextView4.setOnClickListener(this);
        mTextView5 = (TextView) findViewById(R.id.textView5);
        mTextView5.setOnClickListener(this);
        mTextView6 = (TextView) findViewById(R.id.textView6);
        mTextView6.setOnClickListener(this);
        mTextView7 = (TextView) findViewById(R.id.textView7);
        mTextView7.setOnClickListener(this);
        mImageView6 = (ImageView) findViewById(R.id.imageView6);
        mImageView6.setOnClickListener(this);
        mImageView7 = (ImageView) findViewById(R.id.imageView7);
        mImageView7.setOnClickListener(this);
        mImageView8 = (ImageView) findViewById(R.id.imageView8);
        mImageView8.setOnClickListener(this);
        mImageView9 = (ImageView) findViewById(R.id.imageView9);
        mImageView9.setOnClickListener(this);
        mTextView8 = (TextView) findViewById(R.id.textView8);
        mTextView8.setOnClickListener(this);
        mTextView9 = (TextView) findViewById(R.id.textView9);
        mTextView9.setOnClickListener(this);
        mTextView10 = (TextView) findViewById(R.id.textView10);
        mTextView10.setOnClickListener(this);
        mTextView11 = (TextView) findViewById(R.id.textView11);
        mTextView11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.iv_set_return:
                finish();
                break;
            case R.id.textView:
                portrait();
                break;
            case R.id.imageView:
                portrait();
                break;
            case R.id.imageView2:
                break;
            case R.id.textView_name:
                updataNickName();

                break;
            case R.id.imageView3:
                break;
            case R.id.textView2:
                updataNickName();
                break;
            case R.id.textView_face:
                break;
            case R.id.textView3:
                break;
            case R.id.imageView4:
                break;
            case R.id.textView_bind:
                break;
            case R.id.imageView5:



                break;
            case R.id.textView4:
                updataSex();
                break;
            case R.id.textView5:
                updataBirthdate();
                break;
            case R.id.textView6:
                updataDistrict();
                break;
            case R.id.textView7:
                updataSignature();
                break;
            case R.id.imageView6:
                break;
            case R.id.imageView7:
                break;
            case R.id.imageView8:
                break;
            case R.id.imageView9:
                break;
            case R.id.textView8:
                updataSex();
                break;
            case R.id.textView9:
                updataBirthdate();
                break;
            case R.id.textView10:
                updataDistrict();

                break;
            case R.id.textView11:
                updataSignature();
                break;
        }
    }

    @Override
    public void onUser(UserinfoBean userinfoBean) {

        if (userinfoBean!=null) {
            uid = userinfoBean.getUid();
            oid = userinfoBean.getPermission().getOrganization().get(0).getOid();
            ImagePipeline imagePipeline = Fresco.getImagePipeline();

            imagePipeline.evictFromMemoryCache(Uri.parse(userinfoBean.getAvatar()));
            imagePipeline.evictFromDiskCache(Uri.parse(userinfoBean.getAvatar()));

// combines above two lines
            imagePipeline.evictFromCache(Uri.parse(userinfoBean.getAvatar()));
            mImageView.setImageURI(Uri.parse(userinfoBean.getAvatar()));
            mTextView2.setText(userinfoBean.getNickname());
            int status = userinfoBean.getFaces().getStatus();
            if (status==1) {
                mTextView3.setText("已认证");
            }else{
                mTextView3.setText("未认证");
            }
            int sex = userinfoBean.getSex();

                switch (sex){
                    case 0:
                        mTextView8.setText("保密");
                        break;
                    case 1:
                        mTextView8.setText("男");
                        break;
                    case 2:
                        mTextView8.setText("女");
                        break;
                }
            String birthdate = userinfoBean.getBirthdate();

                if (birthdate!=null&&!birthdate.equals("")){
                    mTextView9.setText(birthdate);
                }else {
                    mTextView9.setText("未设置");
                }

            UserinfoBean.DistrictBean district = userinfoBean.getDistrict();
                if (district!=null){
                    mTextView10.setText(district.getProvince().getName()+"-"+district.getCity().getName());
                }else {
                    mTextView10.setText("未设置");
                }
            String signature = userinfoBean.getSignature();
                if (signature!=null){
                    mTextView11.setText(signature);
                }else {
                    mTextView11.setText("你什么都没说~");
                }

        }

    }

    @Override
    public void onDefeated() {

    }

    @Override
    public void accountUpdata(UserUpdate userUpdate) {
        if (userUpdate!=null){
            int errcode = userUpdate.getErrcode();
            if (errcode==0){
                setPresenter.getUserInfo(token);
                Toast.makeText(this,"修改成功",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"修改失败请检查网络相关",Toast.LENGTH_SHORT).show();
            }

        }
    }

    @Override
    public void district(ProvinceandCity provinceandCity) {


        if (provinceandCity != null) {
            int errcode = provinceandCity.getErrcode();
            if (errcode == 0) {
                data = provinceandCity.getData();


            }
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        setPresenter.getUserInfo(token);
        setPresenter.getDistrict();
    }

    public void updataBirthdate(){
        Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);
        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                String  i1s ;
                if (i1<10){
                    i1s = "0"+i1;
                }else {
                    i1s = i1 + "";
                }
                setPresenter.getAccountUpdata(token,i+"-"+i1s+"-"+i2,"birthdate",uid,oid+"");


            }
        },mYear, mMonth, mDay).show();
    }
    public void updataSex(){
        String[] single_list = {"保密", "男", "女"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("修改性别");

        builder.setSingleChoiceItems(single_list, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                setPresenter.getAccountUpdata(token,which+"","sex",uid,oid+"");
                dialog.dismiss();

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();



    }
    public void updataDistrict(){

        mPicker.setOnCityItemClickListener(new OnCityItemClickListener() {
            @Override
            public void onSelected(ProvinceBean province, CityBean city, DistrictBean district) {
                String id = 0+"-"+province.getId()+"-"+city.getId()+"-"+district.getId();
                setPresenter.getAccountUpdata(token,id,"district",uid,oid+"");
            }
            @Override
            public void onCancel() {
                Toast.makeText(SetActivity.this,"已取消",Toast.LENGTH_SHORT).show();
            }
        });
        //显示
        mPicker.showCityPicker( );



    }
    public void updataSignature(){

        final EditText editText = (EditText) View.inflate(this, R.layout.signatureeditext, null);
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        new AlertDialog.Builder(this)
                .setTitle("设置个性签名")

                .setView(editText )
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        setPresenter.getAccountUpdata(token,editText.getText().toString(),"signature",uid,oid+"");
                    }
                })
                .setNegativeButton("取消", null)
                .show();


    }
    public void updataNickName(){

        final EditText editText = (EditText) View.inflate(this, R.layout.signatureeditext, null);
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        new AlertDialog.Builder(this)
                .setTitle("修改姓名")

                .setView(editText )
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        setPresenter.getAccountUpdata(token,editText.getText().toString(),"nickname",uid,oid+"");
                    }
                })
                .setNegativeButton("取消", null)
                .show();


    }



    /**
     * 自动获取相机权限
     */
    private void autoObtainCameraPermission() {

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
                || ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)) {
                ToastUtils.showShort(this, "您已经拒绝过一次");
            }
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE}, CAMERA_PERMISSIONS_REQUEST_CODE);
        } else {//有权限直接调用系统相机拍照
            if (hasSdcard()) {
                imageUri = Uri.fromFile(fileUri);
                //通过FileProvider创建一个content类型的Uri
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    imageUri = FileProvider.getUriForFile(this, "com.example.android.new_nds_study.fileprovider", fileUri);
                }
                PhotoUtils.takePicture(this, imageUri, CODE_CAMERA_REQUEST);
            } else {
                ToastUtils.showShort(this, "设备没有SD卡！");
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            //调用系统相机申请拍照权限回调
            case CAMERA_PERMISSIONS_REQUEST_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (hasSdcard()) {
                        imageUri = Uri.fromFile(fileUri);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                            imageUri = FileProvider.getUriForFile(this, "com.example.android.new_nds_study.fileprovider", fileUri);//通过FileProvider创建一个content类型的Uri
                        PhotoUtils.takePicture(this, imageUri, CODE_CAMERA_REQUEST);
                    } else {
                        ToastUtils.showShort(this, "设备没有SD卡！");
                    }
                } else {

                    ToastUtils.showShort(this, "请允许打开相机！！");
                }
                break;


            }
            //调用系统相册申请Sdcard权限回调
            case STORAGE_PERMISSIONS_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    PhotoUtils.openPic(this, CODE_GALLERY_REQUEST);
                } else {

                    ToastUtils.showShort(this, "请允许打操作SDCard！！");
                }
                break;
            default:
        }
    }

    private static final int OUTPUT_X = 480;
    private static final int OUTPUT_Y = 480;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                //拍照完成回调
                case CODE_CAMERA_REQUEST:
                    cropImageUri = Uri.fromFile(fileCropUri);
                    PhotoUtils.cropImageUri(this, imageUri, cropImageUri, 1, 1, OUTPUT_X, OUTPUT_Y, CODE_RESULT_REQUEST);
                    break;
                //访问相册完成回调
                case CODE_GALLERY_REQUEST:
                    if (hasSdcard()) {
                        cropImageUri = Uri.fromFile(fileCropUri);
                        Uri newUri = Uri.parse(PhotoUtils.getPath(this, data.getData()));
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            newUri = FileProvider.getUriForFile(this, "com.example.android.new_nds_study.fileprovider", new File(newUri.getPath()));
                        }
                        PhotoUtils.cropImageUri(this, newUri, cropImageUri, 1, 1, OUTPUT_X, OUTPUT_Y, CODE_RESULT_REQUEST);
                    } else {
                        ToastUtils.showShort(this, "设备没有SD卡！");
                    }
                    break;
                case CODE_RESULT_REQUEST:
                    Bitmap bitmap = PhotoUtils.getBitmapFromUri(cropImageUri, this);
                    if (bitmap != null) {
                        showImages(bitmap,fileCropUri);
                    }
                    break;
                default:
            }
        }
    }


    /**
     * 自动获取sdk权限
     */

    private void autoObtainStoragePermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSIONS_REQUEST_CODE);
        } else {
            PhotoUtils.openPic(this, CODE_GALLERY_REQUEST);
        }

    }

    private void showImages(Bitmap bitmap, File fileCropUri) {

        setPresenter.setAvatar(token,fileCropUri,"avatar",uid,oid+"");

    }

    /**
     * 检查设备是否存在SDCard的工具方法
     */
    public static boolean hasSdcard() {
        String state = Environment.getExternalStorageState();
        return state.equals(Environment.MEDIA_MOUNTED);
    }
    public void portrait(){
        View inflate = LayoutInflater.from(this).inflate(R.layout.capturing_photos, null);
        photo_photograph = inflate.findViewById(R.id.photo_photograph);
        photo_album = inflate.findViewById(R.id.photo_album);
        photo_cancel = inflate.findViewById(R.id.photo_cancel);
        final PopupWindow popupWindow = new PopupWindow(this);
        popupWindow.setContentView(inflate);
        popupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(false);
        popupWindow.setOutsideTouchable(true);
        photo_photograph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoObtainCameraPermission();
                popupWindow.dismiss();
            }
        });
        photo_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPic(SetActivity.this,CODE_GALLERY_REQUEST);
                popupWindow.dismiss();
            }
        });
        photo_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

        //点击其他地方消失
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                // popupWindow隐藏时恢复屏幕正常透明度
                popupWindow.dismiss();
                setBackgroundAlpha(1.0f);
            }
        });
        View rootview = LayoutInflater.from(this).inflate(R.layout.activity_set, null);
        popupWindow.showAtLocation(rootview, Gravity.BOTTOM, 0, 0);
    }
    public void setBackgroundAlpha(float bgAlpha) {
        WindowManager.LayoutParams lp = this.getWindow()
                .getAttributes();
        lp.alpha = bgAlpha;
        this.getWindow().setAttributes(lp);

    }

    /**
     * @param activity    当前activity
     * @param requestCode 打开相册的请求码
     */
    public static void openPic(Activity activity, int requestCode) {
        Intent photoPickerIntent = new Intent(Intent.ACTION_GET_CONTENT);
        photoPickerIntent.setType("image/*");
        activity.startActivityForResult(photoPickerIntent, requestCode);
    }
    public static void openCamera(Activity activity){
        mPictureFile = new File(Environment.getExternalStorageDirectory(),
                "picture" + System.currentTimeMillis()/1000 + ".jpg");
        // 启动拍照,并保存到临时文件
        Intent mIntent = new Intent();
        mIntent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        mIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(mPictureFile));
        mIntent.putExtra(MediaStore.Images.Media.ORIENTATION, 0);
        activity.startActivityForResult(mIntent, REQUEST_CAMERA_IMAGE);

    }

}
