/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.core.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.core.data.model.Dog
import com.example.androiddevchallenge.core.data.model.Sex
import com.example.androiddevchallenge.core.data.model.Size

object DogRepository {

    val allDogs = listOf(
        Dog(
            id = 0,
            name = "Ben",
            avatarImage = R.drawable.dog_1,
            detailImage = R.drawable.dog_1_detail,
            description = """Ben is a delightful dog looking for an experienced family who is interested in taking on a project dog and help him reach his full potential.

This bright lad is used to the great outdoors but loves to have fuss from his favourite people. With an independent spirit, Ben is undergoing training to help him deal with everyday life, and new owners will need to be prepared to work with him, be it in the home or when out and about. His new owners must be prepared to keep him on lead and muzzled when out and about.

He will need to be the only pet in an adult only home.

He likes to play with toys and is amazing with the agility equipment, and would suit an active family that likes to go for long walks and practice sports.
""",
            size = Size.Medium,
            sex = Sex.Male,
            age = "4 Years 5 Months",
            canLiveWithChildren = false,
            canLiveWithCats = false,
            canLiveWithDogs = false
        ),
        Dog(
            id = 1,
            name = "Scooter",
            avatarImage = R.drawable.dog_2,
            detailImage = R.drawable.dog_2_detail,
            description = """Scooter is a bright dog who needs both his body and brain kept busy. He builds friendships fast, but can be a little tentative and shy at first and would best suit owners that can be gentle with him initially.

Once bonded he can become overstimulated and jump up at owners whilst mouthing a little. He will need confident experienced owners who will be able to continue with the training we have put in place for him. He is also very endearing and with the correct approach can be calm and enjoy gentle interactions.

Scooter is an active dog looking for a home that can help him burn off his energy in a constructive way. If left to his own devices scooter will look for ways to entertain himself so will need enrichment and committed owners.

Scooter will need to be walked on lead and wearing a muzzle - this is due to his high chase drive with wildlife, so he would need his own garden where he can run off lead and enjoy games with his toys.

He enjoys a good game with other dogs and with people, and is very comical when he plays with his toys - he is all legs and can get very scatty!

Scooter appreciates those who can be gentle with him at first and would be a fantastic dog for experienced dog owners who enjoy lots of training and are looking for a project.
""",
            size = Size.Large,
            sex = Sex.Male,
            age = "1 Year 9 Months",
            canLiveWithChildren = false,
            canLiveWithCats = false,
            canLiveWithDogs = false
        ),
        Dog(
            id = 2,
            name = "Teddy",
            avatarImage = R.drawable.dog_3,
            detailImage = R.drawable.dog_3_detail,
            description = """This growing lad is a mix of two working breeds and will need owners who can both mentally and physically give him the right channels for his energy.

Teddy has displayed some concerning behaviours around resources when younger and will need work continued in this area.

As expected of a pup, Teddy can be nippy and mouthy, this can become more over the top at times and will need continued training to help him know what to do in excitable situations and reduce this being practiced, especially as we do expect Teddy to be a pretty big adult!
""",
            size = Size.Large,
            sex = Sex.Male,
            age = "5 Years 6 Months",
            canLiveWithChildren = true,
            canLiveWithCats = true,
            canLiveWithDogs = false
        ),
        Dog(
            id = 3,
            name = "Molly",
            avatarImage = R.drawable.dog_4,
            detailImage = R.drawable.dog_4_detail,
            description = """Molly has the most wonderful face and she is a real charmer.

She came to us as a stray so unfortunately we do not have any history on her. Molly has showed to be a canon ball of energy and is looking for a owner who can help her channel that energy in a constructive way with lots of training and exercise.

Molly will need on-going training in multiple areas including continuing her manners around other dogs and channel her energy appropriately. For this reason, we are looking for owners who have experience with high energy, boisterous bull breed types before.

Molly is deep down a sensitive soul but can at times overcompensate and become easily aroused, in the right home will make lovely and fun companion.
""",
            size = Size.Medium,
            sex = Sex.Female,
            age = "4 Years",
            canLiveWithChildren = false,
            canLiveWithCats = false,
            canLiveWithDogs = false
        ),
        Dog(
            id = 4,
            name = "Duke",
            avatarImage = R.drawable.dog_5,
            detailImage = R.drawable.dog_5_detail,
            description = """Duke is a fun and energetic youngster who has had an unsettled start to life. Because of this he finds it difficult to settle and can become easily stressed or overstimulated, especially in new situations.

Due to growing up in lockdown Duke had not had the chance to meet new people very often in his previous home and owners will need to be prepared to give him lots of socialising and positive experiences, especially around unknown people entering his home.

Despite his rocky start, he has shown to be a fun, responsive and playful boy who is eager to please and learn and will be a great companion if given the guidance and consistency he needs.

Duke is looking for owners who have experience with enthusiastic bull breeds and is willing to put in some extra work to ensure he becomes the well rounded adult he has the potential to be.
""",
            size = Size.Medium,
            sex = Sex.Male,
            age = "1 Year",
            canLiveWithChildren = false,
            canLiveWithCats = false,
            canLiveWithDogs = false
        ),
        Dog(
            id = 5,
            name = "Beccy",
            avatarImage = R.drawable.dog_6,
            detailImage = R.drawable.dog_6_detail,
            description = """Fancy Beccy, as she was known in the racing circles, is a gentle and lovely greyhound, a perfect reflection of her breed.

She is looking for a loving family where she can relax, after hanging up her racing shoes. Beccy is very friendly and gentle around people, a loves a good old fuss.

Beccy has shown on occasion to be intolerant around other dogs, so for this reason she will need to be muzzled and kept on lead when out on walks.

She will need ongoing training in some areas, such as being left alone and also to a quirk we have seen whilst on foster - her strongly reacting to her own reflection in shiny surfaces, which will need some ongoing training and maintenance. Beccy is therefore looking for a home without too many reflective surfaces!

Gorgeous Beccy would make a great addition to any family and would love nothing more than to snooze on the sofa next to her new favourite people.
""",
            size = Size.Large,
            sex = Sex.Female,
            age = "4 Years 10 Months",
            canLiveWithChildren = true,
            canLiveWithCats = false,
            canLiveWithDogs = false
        ),
        Dog(
            id = 6,
            name = "Teddy",
            avatarImage = R.drawable.dog_7,
            detailImage = R.drawable.dog_7_detail,
            description = """Teddy is a young Chihuahua, who has taken time to settle and build bonds at Battersea.

He is very nervous and avoiding of new people, often growling at them and running away. He is similarly nervous of being touched (including issues around having his collar and lead put on) it does take a little time but once he has built a bond with you (toys and treats help!) he is more tolerant of formal handling.

Teddy is looking for an experience adult only home with with understanding, patient owners who have first hand experience of owning a dog with similar needs. He will need on-going training and it will take Teddy time to settle and show his true character.

He has been a little nervous of loud traffic and motorbike sounds, and that is why he is best to live in a more suburban setting than in a busy location.

Once he does build a bond with you, Teddy is a sweet lad just looking for some human companionship. He is only a youngster and is quite playful and interactive with toys, dropping a ball for you to throw it for him again and again!
""",
            size = Size.Small,
            sex = Sex.Male,
            age = "1 Year 1 Month",
            canLiveWithChildren = false,
            canLiveWithCats = true,
            canLiveWithDogs = false
        ),
        Dog(
            id = 7,
            name = "Gav",
            avatarImage = R.drawable.dog_8,
            detailImage = R.drawable.dog_8_detail,
            description = """Meet Gav the delightful lad with a big head and a big heart. Gav is a beautiful boy who has a large fan club here at Battersea and we cant wait to see him in his forever home.

Gav has some history of separation anxiety where he found it difficult to be left alone. He is slowly learning how to spend time on his own but will require a long settling in period when going to his new home.

Gav is also learning how to walk nicely on the lead and how to be comfortable within different environments. Both of these areas will require ongoing training with his new family.

He is a sensitive lad and as a young American Bulldog he will need experienced owners to help him along the way. He was very worried at first in kennels and struggled in different environments, so he may need some time and help to adjust.

He can be worried of new people but soon warms up and loves treats and toys.

He will need a private garden for some training and his own area to find his feet in.

Gav is a handsome and cuddly guy and will be the perfect forever friend. If you are interested in rehoming Gav please complete our online application form, after which you’ll be given further guidance. If we feel he is the right match for you we’ll be in touch for further information but please be aware that due to the volume of enquiries we receive, we are unable to speak directly to everyone. We will only look to contact homes that we feel best meet all of his needs.
""",
            size = Size.Large,
            sex = Sex.Male,
            age = "3 Years 7 Months",
            canLiveWithChildren = false,
            canLiveWithCats = false,
            canLiveWithDogs = false
        ),
        Dog(
            id = 8,
            name = "Albi",
            avatarImage = R.drawable.dog_9,
            detailImage = R.drawable.dog_9_detail,
            description = """Albi, meaning "noble" suits this handsome and special boy, he is blind and is looking for a specific home where his needs can be met.

He has previously lived with other dogs but has shown issues sharing resources and although he is happy to meet other dogs out and about, he requires a home on his own where he can find his feet and take things at his pace.

Albi will need a household with consistent areas that he can retreat to and settle, he can be easily startled and has previously shown 'sleep startle' behaviour and requires a quiet adult only household with quiet, green walking routes nearby.

Albi is uncomfortable when approached around resources and when he is settled, it is important that his new owners are ready to take on a more independent soul that needs his own space.
""",
            size = Size.Medium,
            sex = Sex.Male,
            age = "6 Years",
            canLiveWithChildren = false,
            canLiveWithCats = false,
            canLiveWithDogs = false
        ),
        Dog(
            id = 9,
            name = "Sky",
            avatarImage = R.drawable.dog_10,
            detailImage = R.drawable.dog_10_detail,
            description = """Meet our beautiful Sky.

Sky has found herself at Battersea, again, through no fault of her own and is super keen to find a new home who will love her unconditionally.

She's a huge fan of people, anyone who makes eye contact is an instant friend!

Sky likes other dogs, and can be a bit too enthusiastic in her greets, but she's also happy doing her own thing. There are some dogs she's not a fan of so her new owners will need to help choose her friends.

Sky has some issues sharing high value food so will need some management around this, and for this reason she needs to be the only dog in the home and not to live with children.

Sky is ready to fill that whole in your life when you are.
""",
            size = Size.Medium,
            sex = Sex.Female,
            age = "8 Years 5 Months",
            canLiveWithChildren = true,
            canLiveWithCats = false,
            canLiveWithDogs = true
        )
    )
}
