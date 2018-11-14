package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.AnalyzedNewsModel
import com.inked_lab.inked.Models.PlainNewsModel

class PlainNewsMockDataSource{
    companion object {

        val News_1 = PlainNewsModel().apply {
            ID = "1"
            newsTitle = "삼성전자 '인피니티 플렉스 디스플레이' 공개"
            newsContent = "소문만 무성했던 삼성전자 폴더블 폰의 윤곽이 드러났다.\n\n삼성전자는 11월7일(현지시간) 미국 샌프란시스코 모스콘센터에서 ‘삼성 개발자 콘퍼런스 2018 (Samsung Developer Conference 2018)’을 열고 화면을 접을 수 있는 ‘인피니티 플렉스 디스플레이’를 공개했다.\n\n삼성전자 미국법인 저스틴 데니슨 전무는 인피티니 플렉스 디스플레이를 소개하며 “접었을 때 콤팩트한 스마트폰, 펼쳤을 때 몰입감 있는 콘텐트 이용환경과 멀티태스킹을 지원하는 차세대 디스플레이”라고 말했다.\n\n지난 달 31일 중국 디스플레이 스타트업 ‘로욜’은 세계 최초 폴더블 폰 ‘플렉스파이’를 공개했다. 플렉스파이는 화면을 바깥으로 접는 ‘아웃폴딩(out-folding)’ 폰이었다. 이와는 달리 삼성표 폴더블 폰은 안으로 접히는 ‘인폴딩(in-folding)’ 방식을 채택하고 있다. 한눈에도 인폴딩 방식이 더 안정적으로 보인다.\n\n스마트폰을 ‘열면’ 7.3인치 AMOLED 디스플레이 화면이 펼쳐진다. 가운데 부분은 이음새 하나 없이 말끔하다. 커버 윈도우에는 유연성 없는 유리 대신 플라스틱 신소재를 써서 접었다 펼 수 있게 만들었다. 또 접었다 펴는 과정을 견딜 수 있는 디스플레이용 접착제가 새롭게 개발돼 적용됐다.\n\n스마트폰 외부에는 4.58인치 디스플레이가 탑재됐다. 기기를 닫은 상태에서도 기존 스마트폰의 기능을 그대로 쓸 수 있다. 스마트폰을 펼쳤을 때 외부의 작은 디스플레이에서 사용하던 앱을 큰 디스플레이로 자연스럽게 이어서 사용할 수 있어, 독특한 경험을 선사할 것으로 보인다.\n\n더 넓은 화면은, 더 넓은 가능성을 보장한다. 인피티니 플렉스 디스플레이 폰은 3개의 앱을 화면에 동시에 띄워 놓을 수 있는 ‘멀티 액티브 윈도우(Multi-Active Window)’를 지원한다. 유튜브로 영상을 보면서 메시지를 확인하고, 이와 동시에 무언가를 검색하는 게 가능하다.\n\n한편 이날 삼성전자는 갤럭시노트, 폴더블 폰 등 대화면 디스플레이에서도 스마트폰을 한 손으로 조작할 수 있는 차세대 사용자 경험(UX), ‘원(One) UI’를 선보였다.\n\n삼성전자는 “폴더블 스마트폰의 가능성을 극대화하고 최적의 사용자 경험을 제공하기 위해 구글과 긴밀히 협력해 안드로이드 플랫폼 단에서부터 최적화하겠다”라며 “테스트 도구 제공을 통해 개발자들이 초기부터 폴더블 앱 개발에 참여할 수 있도록 적극 지원할 계획이다”라고 밝혔다.\n\n폴더블 폰의 제품명, 가격, 출시일, 세부 사양 등 구체적인 정보는 공개되지 않았다. 업계는 내년 초 삼성전자가 폴더블 폰을 정식 공개할 것으로 예상하고 있다."
            originNewsUrl = "https://www.bloter.net/archives/323924"
            thumbnailUrl = "https://www.bloter.net/wp-content/uploads/2018/11/sdc18-kntsp-2.jpg"
            publisher = "Bloter"
        }

        val News_2 = PlainNewsModel().apply {
            ID = "2"
            newsTitle = "삼부토건, 1240억원 규모 공동주택 신축공사 계약…‘매출의 44.21% 규모’"
            newsContent = "[이코노뉴스=서지현 기자] 삼부토건은 위드스테이제1호위탁관리부동산투자회사와 1239억7134억원 규모의 천안신방르네상스 공동주택 신축공사 계약을 맺었다고 9일 공시했다.\n\n계약금은 연결 재무제표 기준 지난해 매출의 44.21% 규모다. 공사기간은 착공일로부터 30개월이다."
            originNewsUrl = "http://www.econonews.co.kr/news/articleView.html?idxno=41862"
            thumbnailUrl = ""
            publisher = "이코노뉴스"
        }

        val News_3 = PlainNewsModel().apply {
            ID = "3"
            newsTitle = "[노컷게임] 자동성장형 MMORPG '뮤 온라인H5' 구글플레이 출시"
            newsContent = "◇ '이카루스M' 빠른 성장 가능한 신규 서버 ‘이자벨라’ 오픈 위메이드이카루스가 개발하고 위메이드서비스에서 퍼블리싱하는 모바일 MMORPG '이카루스M'이 지난 30일 신규 서버 ‘이자벨라’를 오픈했다. 새롭게 선보인 서버 ‘이자벨라’ 에서는 ‘이자벨라의 축복’을 통해 사냥 경험치 2배, 아이템 및 골드 획득량 증가 등의 혜택을 받을 수 있다.  또한, 보유 중인 펠로우의 고유 능력치를 상승 시킬 수 있는 ‘펠로우 각인 시스템’이 추가됐다. ‘펠로우 각인 시스템’은 속성 저항 능력 및 공격력, 방어력과 체력 등 속성 별로 총 6개의 슬롯에 각인이 가능해 전투력을 향상 시킬 수 있다.\n\n◇ 네시삼십삼분, 모바일 전략게임 '매드로켓' 글로벌 출시 네시삼십삼분(4:33)은 30일 모바일 전략 시뮬레이션 게임 ‘매드로켓’(개발사 라타타스튜디오)을 구글플레이와 앱스토어를 통해 전세계 140개국에 글로벌 출시했다. 정식 명칭 ‘매드로켓: 포그 오브 워(Mad Rocket: Fog of War)’는 개인 간 전투(PVP) 기반의 모바일 전략 게임이다. 전장 안개라는 장치를 도입해 기존 모바일 전략 게임과 차별성을 두고 전략적인 요소를 극대화했다. ‘매드로켓’에서는 이용자가 타일 기반 기지를 자유자재로 구성할 수 있으며 안개 속에 방어 시설을 숨길 수 있어 상대의 허를 찌르는 창의적인 방어 전략이 가능하다. 공격자는 로켓 미사일, 공중 유닛, 지상 유닛 등 세가지 타입의 무기를 적재적소에 활용해 방어선을 뚫어 나가면서 마치 퍼즐을 푸는 듯한 재미를 느낄 수 있다.\n\n◇ 모바일 게임 ‘신비아파트 고스트헌터’ 출시 씨제이이엔엠(CJ ENM)의 인기 애니메이션 ‘신비아파트’를 모바일 게임에서도 만나볼 수 있게 됐다. 3F Factory가 개발하고 서비스하는 모바일게임인 ‘신비아파트 고스트헌터’가 31일 소프트 런칭된다.  ‘신비아파트 고스트헌터’는 3F Factory가 CJ ENM으로부터 ‘신비아파트’ 애니메이션 IP의 라이선스 체결 후 제작한 모바일 게임이다. 애니메이션 신비아파트의 주인공들과 함께 귀신을 포획하고, 위험에 빠진 사람들을 구하는 스토리를 기반으로 제작되었다.  특히, 증강현실(AR) 기술을 적용해 현실 속에 숨어있는 귀신들을 직접 찾아 포획하고 수집하는 재미를 느낄 수 있다는 점이 킬링포인트.  이벤트 포획모드에서는 위치기반 AR게임들의 안전 취약점을 극복하기 위해AR기술에 사물 인식 기술을 더했다. 특정 사물을 카메라로 비추면 귀신 캐릭터가 나타나 사로잡을 수 있다. 뿐만 아니라 누구나 쉽게 즐길 수 있는 퍼즐 게임도 함께 탑재해 수집한 귀신과 함께 힘을 합쳐 악귀를 소탕하는 또 다른 즐거움을 선사한다.  ‘신비아파트 고스트헌터’ 게임에는 원작의 인기 캐릭터 ‘강림’, ’리온’ 캐릭터가 SD버전의 귀여운 모습으로 등장해 애니메이션과는 또 다른 매력을 선보인다. 또한, 인터넷 연결 없이도 플레이할 수 있도록 제작돼 데이터 소모에 대한 걱정 없이 게임을 즐길 수 있다.\n\n◇ 카카오게임즈 '프렌즈레이싱' 양대 마켓 최고 인기 게임 등극 카카오게임즈의 캐주얼 모바일 레이싱 게임 ‘프렌즈레이싱’이 구글 플레이 및 애플 앱스토어 게임 인기 순위 1위를 차지했다. 지난 26일 정식 서비스를 시작한 '프렌즈레이싱’은 라이언, 어피치 등 8종의 국민 캐릭터 ‘카카오프렌즈’가 등장하는 레이싱 게임으로 사전 예약에 150만 명이 참여하는 등 하반기 기대작의 면모를 보이며 관심을 모아왔다. ‘프렌즈레이싱’은 풀 3D 디자인의 캐릭터와 맵에서 즐기는 스릴 만점 경주와 이용자의 취향대로 제작할 수 있는 ‘커스터마이징 카트’ 등으로 오픈베타서비스 기간에 가입자 100만명을 돌파하며 이용자들에게 큰 사랑을 받고 있다. 특히 ‘카카오프렌즈’ IP(지식재산권) 최초로 도입한 음성으로 큰 반향을 일으키는 등 모바일 레이싱 게임 시장에 돌풍을 일으키고 있다. 카카오게임즈는 이번 ‘프렌즈레이싱’ 양대 마켓 인기 순위 석권을 기념해 인게임 보상을 이용자들에게 제공한다. 이와 더불어 정식 서비스 오픈 기념 이벤트도 진행해 11월 4일까지 게임 레벨 3을 달성한 이용자 전원에게 신상 ‘프렌즈레이싱 이모티콘’을 선물한다.\n\n◇ 웹젠 자동성장형 MMORPG ‘뮤 온라인H5’, 구글플레이 출시 웹젠이 자사 신작 게임 ‘뮤 온라인H5(MU ONLINE H5)’의 정식서비스를 시작했다. 웹젠은 31일 오후 3시 구글플레이 스토어에서 신작 ‘뮤 온라인H5’의 다운로드(Download) 서비스를 시작했다. ‘뮤 온라인H5’는 협동과 경쟁, 성장 등 즐길 거리가 다양한 ‘뮤(MU)’의 고유한 콘텐츠를 활용해 MMORPG의 재미는 그대로 이어가면서 ‘자동성장형 RPG’라는 특성을 더해 편의성을 크게 높인 게임이다.  정식 출시되는 ‘뮤 온라인H5’는 게임 내 미션 수행으로 달성한 업적 포인트에 따라 캐릭터 슬롯을 추가해 흑기사와 흑마법사, 요정 등 여러 캐릭터를 동시에 육성하면서 모두 데리고 다니는 ‘동시 성장’과 ‘협공 시스템’을 차별화 요소로 내세웠다.  11월 22일까지 각 서버 별 전투력 랭킹에 따라 가장 총 전투력이 높은 3명에게 ‘영웅/용사/희귀 영혼(각 순위)’, ‘5등급 선물상자(공격, 방어, 생명 중 택1)’, ‘각 순위 특별 호칭’ 등 특별한 게임 아이템을 증정하는 등 감사 이벤트를 마련했다. "
            originNewsUrl = "http://www.nocutnews.co.kr/news/5055236"
            thumbnailUrl = "http://file2.nocutnews.co.kr/newsroom/image/2018/11/02/20181102174042237115_0_710_350.jpg"
            publisher = "노컷뉴스"
        }

        val News_4 = PlainNewsModel().apply {
            ID = "4"
            newsTitle = "롯데푸드, 분유 떼고 먹는 '위드맘 첫 우유' 출시"
            newsContent = "롯데푸드 (639,000원 상승1000 0.2%) 파스퇴르가 분유나 젖을 떼고 먹는 첫 우유인 ‘위드맘 첫 우유’를 선보인다고 9일 밝혔다.\n\n위드맘 첫 우유는 생우유를 먹기 시작하는 아이에게 필요한 영양성분을 강화한 우유다. 한국 영유아들에게 부족한 DHA(고도불포화지방산) 등 다양한 영양성분을 담았다.\n\n전문가들은 생애 첫 1000일(임신기 270일+두 돌 730일) 영양이 아이의 평생건강에 큰 영향을 미친다고 강조한다. 특히 아기의 두뇌 형성이 급격히 이뤄져 생후 1년간 뇌가 두 배 이상으로 성장하고, 생후 3년까지 성인 뇌 크기의 85%가 자란다.  \n\n위드맘 첫 우유에 적용한 식물성 DHA는 대형 발효조에서 해조류를 배양해 DHA를 추출하기 때문에 각종 해양 오염물질로부터 안전하다. 식물성 DHA 외에도 면역력 강화에 좋은 아연 성분, 균형 잡힌 성장과 발육을 위한 칼륨, 칼슘, 비타민D를 더했다. 또 친환경 무항생제 인증을 받은 목장의 원유를 집유해 만들었다. \n\n아이들이 남길 걱정 없는 125ml 소용량에 친환경 종이팩 우유로 휴대가 편리하고 실온 보관이 가능해 보관성이 좋다. 파스퇴르 몰 등 온라인과 대형마트 등에서 구입할 수 있다.\n\n롯데푸드 파스퇴르 관계자는 “돌 전후 분유와 생우유 사이에 아이 영양 공급에 부족함이 있을 수 있다”며 “위드맘 첫 우유에는 두뇌 형성과 평생 건강에 중요한 이 시기에 필요한 영양을 담았다”고 말했다."
            originNewsUrl = "http://news.mt.co.kr/mtview.php?no=2018110909340936352"
            thumbnailUrl = "http://thumb.mt.co.kr/06/2018/11/2018110909340936352_1.jpg"
            publisher = "머니투데이"
        }

        val News_5 = PlainNewsModel().apply {
            ID = "5"
            newsTitle = "현대重그룹, 일렉트릭 무상증자·지분 추가 매입…'주주가치 제고'"
            newsContent = """【서울=뉴시스】 박주연 기자 = 현대중공업그룹이 현대일렉트릭의 무상증자와 현대중공업지주의 현대일렉트릭의 지분 3% 추가 매입을 결의했다.\n\n현대일렉트릭과 현대중공업지주는 9일 각각 이사회를 열어 주식유동성 확보 및 주주가치 제고를 위해 이같은 안건을 의결했다. \n\n 이에 따라 현대일렉트릭은 보통주 1주당 신주 1주를 배정하는 무상증자를 실시한다. 무상증자 신주배정기준일은 오는 26일이며, 신주는 다음달 18일부터 상장된다.  \n\n현대중공업지주는 자회사인 현대일렉트릭의 지분 3%를 124억원에 추가 취득한다. 취득예정기간은 현대일렉트릭의 무상증자 신주배정기준일인 26일부터 내년 2월25일까지다. 이번 조치로 현대중공업지주가 보유한 현대일렉트릭의 지분율은 37.6%까지 확대된다.\n\n이번 현대일렉트릭의 무상증자 및 현대중지주의 지분 매입은 그룹이 지주사 체제로 전환한 이후 천명해 온 주주친화경영정책의 일환이다. \n\n현대중공업그룹은 지난 8월 현대중공업지주가 배당성향 70% 이상(시가배당률 5%)을 유지하는 배당정책을 발표했다. 이달 초에는 현대건설기계가 주주가치 제고를 위해 자기주식취득 및 무상증자를 실시했다.   \n\n현대일렉트릭 관계자는 "이번 무상증자는 주식유동성이 낮다는 시장의 의견을 적극 반영한 것"이라며 "앞으로도 회사의 가치가 시장에서 적절하게 평가될 수 있도록 시장과의 소통에 힘쓸 것"이라고 밝혔다.  \n\n현대일렉트릭은 점차 회복되고 있는 시황에 맞춰 실적개선을 바탕으로 한 기업가치 향상을 위해 최선을 다한다는 계획이다. 특히 스마트팩토리 구축, 미국 앨라배마 법인 증설 등 현재 진행 중인 투자가 완료되면 내년부터는 전반적인 수익성 개선 효과가 나타날 것으로 기대하고 있다.\n\n현대중공업지주는 기업가치가 현저히 저평가돼 있는 현대일렉트릭의 지분을 매입해 자회사의 실적 개선에 대한 자신감을 나타내는 한편, 시장 신뢰 회복과 주주가치 제고에 힘쓰겠다는 계획이다.\n\n현대중공업지주 관계자는 "최근 현대일렉트릭은 주가순자산비율(PBR) 0.44배 수준에서 거래되고 있다"며, "회사의 내재가치 및 성장성에 비해 주가가 절대적으로 저평가 상태에 있다"고 밝혔다."""
            originNewsUrl = "http://www.newsis.com/view/?id=NISX20181109_0000468496&cID=13001&pID=13000"
            thumbnailUrl = "http://image.newsis.com/2018/11/09/NISI20181109_0000226926_web.jpg?rnd=20181109111727"
            publisher = "뉴시스"
        }

        val News_6 = PlainNewsModel().apply {
            ID = "6"
            newsTitle = "LG전자, CES서 올레드 TV·가전 등 혁신상 쾌거"
            newsContent = """LG전자는 'CES 최고 혁신상(CES 2019 Best Innovation Awards)'을 비롯해 'CES 혁신상(CES 2019 Innovation Awards)'을 대거 수상했다고 9일 밝혔다.\n\n미국 소비자기술협회(CTA)는 내년 1월 미국 라스베이거스에서 열리는 세계 최대 가전 박람회 CES(Consumer Electronics Show)에 앞서, 출품될 제품 중 가장 혁신적인 제품들을 매년 11월 선별해 이 상을 수여한다.\n\n전략 프리미엄 스마트폰 'LG V40 씽큐'는 CES 최고 혁신상의 영예를 안았다. LG V40 씽큐는 후면 3개, 전면 2개 등 5개 카메라를 장착한 국내 최초의 스마트폰이다. 카메라 수는 많아졌지만 169g의 무게와 7.7mm 두께로 6.4인치 이상 스마트폰 중 여전히 가장 얇고 가벼워 한 손으로 다루기도 쉽다.\n\nLG 사운드 바 역시 CES 최고 혁신상을 받았다. LG 사운드 바로는 사상 최초다. 뛰어난 편의성과 영국 명품 오디오 브랜드 메리디안 오디오(Meridian Audio)의 기술이 더해진 뛰어난 사운드가 특징이다.\n\n프리미엄 TV 시장을 재편하고 있는 'LG 올레드 TV'는 올해 CES 혁신상을 3개나 받았다. 이로써 7년 연속으로 혁신상을 받는 기염을 토했다. LG 올레드 TV는 자발광을 기반으로 완벽한 블랙을 구현해, 뛰어난 화질을 인정받고 있다. 얇게 제작하는 것도 가능해 기존 TV의 디자인을 뛰어넘는 가능성을 선보이며 2013년부터 매년 상을 받아왔다.\n\nLG전자 전략 제품들은 골고루 혁신상을 받았다. ▲프리미엄 LCD TV인 'LG 슈퍼 울트라HD TV' ▲간편하게 의류를 관리할 수 있는 '트롬 스타일러' ▲대용량 건조기 ▲매년 노트북 업계에 돌풍을 일으키고 있는 'LG 그램' ▲메르디안의 프리미엄 사운드를 얹은 'LG 사운드 바' ▲초고화질 프로젝터 'LG 시네빔' ▲실제 시계 바늘을 탑재한 스마트워치 'LG 워치 W7' ▲스마트폰의 핵심기능과 편리한 AI를 담은 'LG G7 씽큐' 등 전략제품들이 골고루 수상했다.\n\nLG전자 북미지역대표 조주완 부사장은 "혁신 기술을 담은 프리미엄 제품들로 시장을 지속 선도할 것"이라고 말했다."""
            originNewsUrl = "http://www.zdnet.co.kr/news/news_view.asp?artice_id=20181109084154"
            thumbnailUrl = "http://image.zdnet.co.kr/2018/11/09/lejj_L6EnKBHSeJkHNSs.jpg"
            publisher = "ZDNet Korea"
        }

        val News_7 = PlainNewsModel().apply {
            ID = "7"
            newsTitle = "아이폰XS·XR 출시 첫날 '가격 상관 없어'"
            newsContent = """애플의 전략 스마트폰 아이폰XS·XS맥스와 아이폰XR이 국내에 오늘(2일) 상륙했다. 이날 구매자들의 대다수가 아이폰뿐 아니라 애플워치 신제품에 더 많을 관심을 보이기도 해 눈길을 끌었다. 이날 서울 강남구 신사동에 위치한 애플스토어 ‘애플 가로수길’에는 개장하기 한 시간 가량 전인 7시 03분을 기준으로 220명의 소비자들이 줄을 이었다. 개장 30분 전에는 250 여명으로 늘어났다.\n\n지난해까지는 애플공인대리점(APR) 출시 행사가 있었지만, 올해에는 애플스토어가 지난 1월에 처음 국내에서 오픈하면서 많은 아이폰 사용자들이 몰렸다. 올해 초 애플스토어 개장 행사 때와 비교해서는 100명 가량 적은 수준이다. 이날 쌀쌀한 늦가을의 날씨에도 두꺼운 코트, 파카, 담요 등으로 무장한 소비자들의 행렬이 가로수길 끝쪽까지 길게 늘어서면서 보행자들의 시선을 끌었다. 대기자들은 기대감에 찬 표정으로 저마다 곧 구매하게 될 아이폰XS와 애플워치4에 대한 이야기를 나누며 매장문이 열리기를 기다렸다.\n\n이윽고 오전 8시가 되자 200여 명의 애플스토어 직원들의 카운트다운에 맞춰 매장 문이 활짝 오픈됐다. 대기자들은 애플 매장 곳곳에 앉아 신형 아이폰 구매를 진행했다. 정시에는 11명의 첫 대기자 그룹이 맨 먼저 매장으로 들어갔다. 이날 신형 아이폰 1호 구매자는 전날(1일) 오후 11시 40부터 줄을 섰던 김상혁(남·25세)씨였다. 애플 가로수길 첫 대기자는 전날 오후 6시가 넘은 시각부터 있었지만 입장 직전 순서가 뒤바뀌면서 김씨가 맨 처음으로 입장했다. 김씨는 이날 아이폰XS 512기가바이트(GB) 골드 색상 모델과 애플워치 시리즈4 44mm 모델을 동시에 구매했다.\n\n김씨는 “아이폰XS 화면도 크고 디자인이 예뻐서 구매를 결정하게 됐는데, 가격은 크게 개의치 않는다”며 “직전엔 삼성 갤럭시 스마트폰을 썼는데 파일 다운로드하는 게 불편한 점이 있어서 아이폰을 구매하기로 결정했다. 이전에는 아이폰4, 아이폰6플러스, 아이폰7 등을 사용한 적이 있다”고 말했다. 아이폰 언락폰(무약정폰) 가격은 ▲아이폰XS맥스 150만원(64GB), 171만원(256GB), 198만원(512GB) ▲아이폰XS는 137만원(64GB), 158만원(256GB), 185만원(512GB) ▲아이폰XR은 99만원(64GB), 106만원(128GB), 120만원(256GB)으로 책정됐다. 전날 자정께부터 줄을 섰던 대학생 이모씨(남·26세)는 6.5인치 아이폰XS맥스 256GB 모델을 구매했다.\n\n이씨는 “아이폰SE를 사용하다가 좋은 카메라를 쓰고 싶은 마음과 더불어 최근 주변에서 대화면 스마트폰을 많이 사용하는 것을 보고 6.5인치 아이폰XS맥스 구매를 결정했다”며 “가격이 낮은 편은 아니지만 재테크로 번 돈이 있어 일시불로 구매할 것”이라고 말했다.\n\n이날 여느 때와는 달리 아이폰보다는 애플워치 신제품을 구매하려는 소비자들이 눈에 많이 띄었다. 애플워치 시리즈4 물량이 충분하지 않다는 소식에 새벽부터 달려온 대기자도 있었다. 또 애플스토어에서 애플워치 시리즈4 에르메스 버전 판매가 이뤄지지 않아 이날 구매을 포기한 소비자도 있었다. 해당 모델은 현재 서울분더샵 매장, 현대백화점 무역센터점 에르메스 매장, 에르메스 도산점 3곳에서 판매되고 있다. 12시간 가량 대기했던 박정수(남·30세)씨는 “애플워치 시리즈4 에르메스를 사려고 왔는데 직원분들이 나와서 에르메스 모델을 구매가 어렵다는 사실을 알려줬다”며 “오늘은 사지 않고 애플스토어에서 처음으로 신제품을 판매하는 날에 방문한 것에 의미를 두고 추억으로 삼으려고 한다”고 말했다. 애플워치 시리즈4를 구매한 이모씨(남·37세)는 “애플워치4 셀룰러 모델에 매력을 느껴 구매하게 됐다”며 “아이폰XS는 현재 사용하고 있는 아이폰X과 크게 차별화된 점이 없고 조금 다른 아이폰XS맥스 모델은 화면이 너무 커서 아직은 구매할 생각이 없다”고 전했다.\n\n전날 오후 6시께부터 가장 처음으로 대기하고 있던 A씨(여·24세)는 "애플워치4를 구매하려 한다"며 "아이폰8을 사용하고 있는데 노치 디자인이 개인적으로 마음에 들지 않아서 아이폰X이나 아이폰XS는 구매하지 않을 것 같다. 가격은 요즘 스마트폰들이 다 비싸서 크게 신경쓰지 않는다"고 말했다."""
            originNewsUrl = "http://www.zdnet.co.kr/news/news_view.asp?artice_id=20181102091511"
            thumbnailUrl = "http://image.zdnet.co.kr/2018/11/02/lejj_DRQifZFhd7u7dAI.jpg"
            publisher = "ZDNet Korea"
        }

        val News_8 = PlainNewsModel().apply {
            ID = "8"
            newsTitle = "이통사 수익성 계속 악화…'5G투자 어쩌나'"
            newsContent = "SK텔레콤, KT, LG유플러스 등 이동통신 3사의 수익성이 지속적으로 악화되고 있다. 지난해 3분기 선택약정할인율 상향 조정 이후 1년째 마이너스 성장을 면치 못하고 있다. 물론 정부의 지속적인 통신비 인하 정책으로 소비자 부담을 줄인 측면은 있다. 하지만 국가적으로 추진하고 있는 5G통신 상용화를 앞두고 네트워크 투자 지출여력이 줄어든 것은 우려할 부분으로 꼽힌다.\n\n2일 KT를 마지막으로 이통 3사의 실적 발표가 마무리됐다. 3사 영업이익 총합은 9천17억원으로 직전 분기보다 821억원 감소한 것으로 나타났다.  이통 3사의 무선사업이 부진을 면치 못한 것은 선택약정할인율 상향이 직접 영향을 미쳤다. 이로 인해 약정할인 가입자들이 늘어나면서 수익이 악화됐다. 최근 들어 약정할인 가입자 증가 속도가 둔화되긴 했지만 3분기 들어 기초연금 수급 어르신들의 요금감면이 적용되면서 추가적인 매출 감소로 이어졌다.\n\n이같은 이유로 매출과 영업이익이 동반 급감하는 상황이 올해 1분기부터 3분기까지 줄곧 계속됐다 문제는 수익성 감소에 따른 투자여력 감소다. 이통 3사는 그 동안 네트워크 유지 보수를 위해 연간 6조원 안팎의 투자를 집행해 왔다. 문제는 연내 5G 이동통신 서비스를 상용화하기 위해선 추가적인 투자지출이 불가피하다는 점이다. 내년 3월 5G 스마트폰이 나오면 투자지출 범위를 대폭 확대해야 한다. 5G 통신 상용화에 앞서 거액의 주파수 할당비용도 납부해야 한다. 이처럼 주파수 할당비용 납부에 이어 네트워크 구축 투자지출이 이뤄져야 하지만, 수익성 여건이 따라주지 못하면서 이통 3사는 여전히 5G 투자 규모를 확정짓지 못하고 있다.\n\n실제 이통사들은 투자자 대상의 실적발표 컨퍼런스콜에서도 비용 효율에 기조를 두고 투자지출을 이어가겠다는 언급만 반복할 뿐이다. 통신사 한 관계자는 “기존 사업의 수익성 회복과 5G와 같은 신규 사업의 사업모델의 수익성 예측이 쉽지 않은 가운데 무리하게 투자규모를 확정하기에는 어려움이 크다”면서 “대규모 장치 산업 특성상 투자 이후 수익을 거두고, 적절한 이용요금 개편을 이어가는 순환이 반복되는데 5G 투자 직전에 수익성이 악화돼 투자에서 요금 개편에 이르는 순환에 차질을 빚지 않게 하는 것이 향후 경영 급선무가 됐다”고 말했다."
            originNewsUrl = "http://www.zdnet.co.kr/news/news_view.asp?artice_id=20181102143558"
            thumbnailUrl = "http://image.zdnet.co.kr/2018/11/02/psooh_XOQ2b1cUO01VoP.jpg"
            publisher = "ZDNet Korea"
        }

        val News_9 = PlainNewsModel().apply {
            ID = "9"
            newsTitle = "넥슨레드, 모바일 MMORPG '액스' 21일 일본 출시"
            newsContent = """[아시아경제 조한울 기자] 넥슨레드의 모바일 다중접속역할수행게임(MMORPG) '액스(AxE)'가 일본에 진출한다.\n\n넥슨지티는 자회사 넥슨레드가 개발한 액스를 21일 일본에 정식 출시한다고 10일 밝혔다. 또 사전예약자는 80만명을 넘겼다고 밝혔다. 현지 출시명은 '페이스(FAITH)'다. \n\n김대훤 넥슨레드 대표는"현지 유저들이 보여준 뜨거운 관심에 감사 드린다" 며 "출시 전까지 원활한 서비스 제공을 위해 철저히 준비하고, 출시 이후에도 지속적으로 유저들과 소통하며 액스만의 매력과 재미를 느낄 수 있도록 노력하겠다"고 말했다. \n\n넥슨 일본법인이 지난 9월 12일부터 안드로이드 사용자를 대상으로 진행 중인 사전예약자도 80만 명을 돌파했다. 9일부터는 iOS 앱스토어 사전예약도 시작했다. \n\n김기한 넥슨 일본법인 본부장은 "페이스에 대한 유저들의 높은 관심에 감사 드리며 정식 출시까지 현지화, 운영 모두 만반의 준비를 다해 기대에 부응할 수 있도록 최선을 다 하겠다"고 말했다."""
            originNewsUrl = "http://view.asiae.co.kr/news/view.htm?idxno=2018111021250399160"
            thumbnailUrl = "http://cphoto.asiae.co.kr/listimglink/1/2018111021241319491_1541852654.jpg"
            publisher = "아시아경제"
        }

        val News_10 = PlainNewsModel().apply {
            ID = "10"
            newsTitle = "LGU+, '5G 서비스 곧 제공할 것'"
            newsContent = "LG유플러스가 최적의 셀 설계를 통한 안정적인 서비스 제공, 대·중·소 기업을 잇는 5G 생태계 구축 전략 수립 등 5G 서비스 제공을 위한 본격적인 작업에 나선다. 오는 12월1일, 서울과 수도권, 일부 광역시를 중심으로 5G 전파 발사를 시작하고, 2019년 3월 이후 스마트폰을 통한 서비스를 시작할 계획이다.\n\nLG유플러스는 6개월이라는 최단기간에 세계 최초의 LTE 전국망을 구축하고 운영해 온 망운영 노하우와 셀 설계 프로그램인 에이톨을 결합, 5G 장비 위치와 안테나 방향 각을 정하는 작업을 진행한다.\n\n에이톨은 전파 설계 프로그램 전문회사 프랑스 포스크사의 솔루션으로, 버라이즌, 보다폰, AT&T 등 글로벌 통신사가 사용한다. 5G는 전파 에너지를 빔 형태로 집중한 빔포밍 기술을 사용하기 때문에 4G에 비해 전파 예측에 어려움이 큰 만큼 레이트래싱(Raytracing) 기법을 적용해 정확도를 높였다. 레이트래싱 기법은 전파가 전달되는 경로를 추적, 건물의 높이와 위치, 모양을 고려해 전파의 반사, 굴절, 회절을 계산하여 예측하기 때문에 정교한 셀 설계가 가능하다.\n\n특히 장비가 위치한 지역의 특성에 맞도록 구축된 LG유플러스만의 4가지 고유 전파모델을 적용, 셀 설계의 정확도를 높였다. 이에 따라 더욱 신속한 네트워크 구축은 물론 작업 최소화를 통한 구축비용 절감, 통화 품질의 지역적 차이 제거, 커버리지 조기 확대 등이 가능하다.\n\nLG유플러스는 지난해 10월부터 1년여 동안의 준비를 통해 최근 1차로 서울을 비롯 경기도와 인천 등 수도권지역 및 광역시에 대한 셀 설계를 완성했다. LG유플러스 최주식 5G추진단장(부사장)은 “첫 전파발사를 목전에 두는 등 5G 시대 개막이 카운트다운에 들어갔다”라며 “5G가 고객들에게 실질적인 혜택을 주고 산업의 효율성을 극대화함으로써 4차 산업혁명의 견인차가 되도록 네트워크 구축, 서비스 개발, 상생과 생태계 활성화에 더욱 박차를 가하겠다”라고 말했다."
            originNewsUrl = "http://www.bloter.net/archives/323550"
            thumbnailUrl = "http://www.bloter.net/wp-content/uploads/2018/11/181105_pr-Lg-5g-.jpg"
            publisher = "Bloter"
        }

        val AllNewsList = mutableListOf(
                News_1,
                News_2,
                News_3,
                News_4,
                News_5,
                News_6,
                News_7,
                News_8,
                News_9,
                News_10
        )
    }
}


object AnalyzedNewsMockDataSource{

    val a_News_1 = AnalyzedNewsModel().apply {
//        mainIncident
    }

    val a_News_2 = AnalyzedNewsModel().apply {
        //        mainIncident
    }


    val a_News_3 = AnalyzedNewsModel().apply {
        //        mainIncident
    }


    val a_News_4 = AnalyzedNewsModel().apply {
        //        mainIncident
    }

    val analyzedNewsGroup_1 = mutableListOf(a_News_1, a_News_2, a_News_3, a_News_4)
    val analyzedNewsGroup_2 = mutableListOf(a_News_1, a_News_2, a_News_3, a_News_4)
    val analyzedNewsGroup_3 = mutableListOf(a_News_1, a_News_2, a_News_3, a_News_4)
}

