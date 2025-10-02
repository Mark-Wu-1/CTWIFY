# CTWIFY 訂房租車平台 Project — 後端 RESTful API（Spring Boot + Security + MS SQL）

## 開發人員
本專案由我與四位同學共同開發 評論功能與客服即時聊天室 會員系統:Nick 房源系統:William 租車系統:Youm 訂單系統:Rene

## 專案簡介
本專案旨在打造一個 **住宿 + 租車一站式整合平台**，提供使用者便利、快速的操作體驗。  
透過會員、房源、租車、訂單、評論等五大系統的整合，實現完整的服務流程。  

##  使用技術
- **前端**：Vue.js
- **後端**：Spring Boot, Hibernate, Servlet  
- **資料庫**：SQL Server  
- **API 技術**：Restful API, Ajax  
- **其他**：JWT、Google 登入、Email 驗證、Log 紀錄  

## 功能簡介

### 🔹 前台（使用者端）
- **會員系統**
  - 註冊、登入、登出（含 Google 登入）
  - 忘記密碼、Email 驗證
  - 更新個人資料
- **房源系統**
  - 房源查詢 / 模糊查詢
  - 房源詳細內容、下訂房源
  - 房東新增 / 編輯 / 上下架 / 移除房源
- **租車系統**
  - 車輛搜尋、條件篩選
  - 車輛預約（避免重複預約）
- **訂單系統**
  - 訂單產生、查詢、修改
  - 信用卡支付
  - Email 通知
- **評論系統**
  - 房客訂單評論
  - 房東回應評論
  - 即時客服聊天室

### 🔹 後台（管理端 / 房東 / 管理員）
- **會員系統**
  - 權限管理（會員 / 房東 / 管理員）
  - 多條件 / 模糊查詢
  - Log 日誌輸出
- **房源系統**
  - 房源設備新增刪除 / 分類管理
  - 房源審核與進度管理
- **租車系統**
  - 車輛管理（新增 / 編輯 / 移除）
  - 預約管理
  - 損壞紀錄表
  - 數據總覽
- **訂單系統**
  - 月結訂單產生與查詢
  - 匯出 CSV
  - 帳務拆分
- **評論系統**
  - 管理員評論管理
  - 即時客服管理

<img width="780" height="580" alt="user" src="https://https://github.com/Mark-Wu-1/CTWIFY/blob/test/104.png" />
<img width="780" height="580" alt="admin" src="https://github.com/Mark-Wu-1/CTWIFY/blob/test/104-2.png" />

