# 2251120018_TranGiaHuy_Baitap03_01
Mô tả: Đây là ứng dụng Android được phát triển trên Android Studio nhằm giới thiệu về thiết kế UI/UX lập trình ứng dụng di động.

Mô tả ngắn gọn về các hàm trong ứng dụng:

1. MainActivity.kt (Màn hình chính)
Hàm onCreate():
Thiết lập giao diện từ activity_main.xml.
Xử lý sự kiện khi nhấn nút "I'm ready" để chuyển sang UIComponentsActivity.
Hàm navigateToUIComponents():
Sử dụng Intent để mở UIComponentsActivity.

2. UIComponentsActivity.kt (Danh sách UI Components)
Hàm onCreate():
Thiết lập giao diện từ activity_ui_components.xml.
Hiển thị danh sách các thành phần UI như Text, Image, TextField, PasswordField, Column, Row.
Xử lý sự kiện khi chọn một thành phần để mở DetailActivity.
Hàm navigateToDetail():
Chuyển sang DetailActivity, truyền dữ liệu về thành phần UI được chọn.

3. DetailActivity.kt (Chi tiết UI Component)
Hàm onCreate():
Thiết lập giao diện từ activity_detail.xml.
Nhận dữ liệu từ UIComponentsActivity để hiển thị thông tin chi tiết của thành phần UI.

4. Điều hướng giữa các màn hình
Nút "Back" trên mỗi màn hình:
Gọi finish() để quay về màn hình trước đó.

Kết quả đạt được: Ứng dụng hoạt động & truy cập trên thiết bị ảo sử dụng hệ diều hành Android 15 và có chức năng như yêu cầu đề ra.
