package org.example.model.general.doingCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingPractice {

    static class GrpAccessId {
        private Integer grpSeqNum;
        private Integer usrId;

        public GrpAccessId(Integer grpSeqNum, Integer usrId) {
            this.grpSeqNum = grpSeqNum;
            this.usrId = usrId;
        }

        public Integer getGrpSeqNum() {
            return grpSeqNum;
        }

        public Integer getUsrId() {
            return usrId;
        }

        @Override
        public String toString() {
            return "GrpAccessId{" +
                    "grpSeqNum=" + grpSeqNum +
                    ", usrId=" + usrId +
                    '}';
        }
    }

   static class GrpAccess {
        private GrpAccessId id;

        public GrpAccess(GrpAccessId id) {
            this.id = id;
        }

        public GrpAccessId getId() {
            return id;
        }

       @Override
       public String toString() {
           return "GrpAccess{" +
                   "id=" + id +
                   '}';
       }
   }

    public static void main(String[] args) {

        // Sample data (like DB result)
        List<GrpAccess> data = List.of(
                new GrpAccess(new GrpAccessId(1, 101)),
                new GrpAccess(new GrpAccessId(1, 102)),
                new GrpAccess(new GrpAccessId(2, 201)),
                new GrpAccess(new GrpAccessId(2, 202)),
                new GrpAccess(new GrpAccessId(3, 301))
        );


        List<Integer> getGIdsLessThenThree = data.stream().filter(g -> g.getId().grpSeqNum < 3).map( r -> r.getId().getGrpSeqNum()).toList();
        System.out.println(getGIdsLessThenThree);
        List<Integer> getEvenUserIds = data.stream().filter( r -> r.getId().usrId % 2 == 0 ).map( r -> r.getId().getUsrId()).toList();
        System.out.println(getEvenUserIds);

        Set<Integer> uniqGrpNo = data.stream().map(g -> g.getId().getGrpSeqNum()).collect(Collectors.toSet());
        System.out.println(uniqGrpNo);


    }
}
